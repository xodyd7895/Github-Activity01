#인덱스
#	사용자가 원하는 데이터가 극히 일부분적이다.
#	순차적인 탐색의 경우 오랜시간이 걸린다.
#	응답시간을 줄이기 위해서 인덱스를 제공한다.
#	인덱스를 제공하는 것: 기본키, 외래키, unique

use myschool;
select * from 학생;
show index from 학생; 
create index 인덱스 on 학생(학생이름);
drop index 인덱스 on 학생;

#함수
show global variables like 'log_bin_trust_funtion_creators';
set global log_bin_trust_function_creators = 'on';

#사용자가 직접 작성한 사용자 함수
#return문에 특정값을 반환하는 기능을 구현할 수 있다.
#매개변수는 in타입이다
#return 반환타입을 선언
#begin~end set하는 SQL문을 사용할 수 없다.
#함수안에서 재귀함수호출, 내장프로시저를 호출할 수가 없다.

delimiter $$
create function 강의실배정2(classNum char(4))
	returns varchar(10)
	begin
		declare classLevel char(20);
        declare classLimit int(10);
        
        select 인원제한 into classLimit from 강의 where 강의번호 =classNum;
        if classLimit > 80 then
			set classLevel = '대강의실';
		elseif classLimit <= 80 and classLimit >= 40 then
			set classLevel ='중강의실';
		else
			set classLevel = '소강의실';
		end if;
        return classLevel;
    end $$
delimiter ;
select * from 강의;
select 강의번호, 강의이름, 인원제한, 강의실배정2(강의번호) as 강의실배정 from 강의;
drop function 강의실배정2;

#트리거
#	데이터가 변경될때 자동으로 실행해야할 동작
#	before, after//	old,new
#	insert, updatw, delete

delimiter $$
create trigger before_학생_update before update
	on 학생
    for each row
    begin
		if new.학년 <1 then
			set new.학년 = 1;
		elseif new. 학년 > 4 then
			set new.학년 =4;
		end if;
    end $$
delimiter ;

update 학생 set 학년 =5 where 학생번호 = '201258047';
select * from 학생;

#트랙젝션
create table 예금통장(
	예금주아이디	varchar(45) not null,
    예금주이름		varchar(45) not null,
    잔액			bigint(20) not null default 0,
    primary key(예금주아이디)
)engine = InnoDB default charset=utf8;

delimiter $$
create trigger before_예금통장_insert
	before insert on 예금통장
    for each row 
    begin
		if new.잔액 < 0 then 
			signal sqlstate '45000' set message_text = '잔액이 부족합니다';
		end if;
    end $$
delimiter ;

delimiter $$
create trigger before_예금통장_update
	before update on 예금통장
    for each row
    begin
		declare message_text varchar(45);
        if new.잔액 <0 then
			signal sqlstate'45000' set message_text='잔액이 부족합니다.';
		end if;
	end $$
delimiter ;
insert into 예금통장 values('00000001','홍길동',4000);
insert into 예금통장 values('00000002','이순신',3000);
select * from 예금통장;

update 예금통장 set 잔액 = 잔액-1000 where 예금주아이디 ='00000001';
update 예금통장 set 잔액 = 잔액+1000 where 예금주아이디 ='00000002';
update 예금통장 set 잔액 = 잔액-5000 where 예금주아이디 ='00000001';
update 예금통장 set 잔액 = 잔액+5000 where 예금주아이디 ='00000002';

start transaction;
	savepoint 여기;		-- 일 처리 실패시 여기
    update 예금통장 set 잔액 = 잔액-5000 where 예금주아이디 ='00000001';
    update 예금통장 set 잔액 = 잔액+5000 where 예금주아이디='00000002';
rollback to 여기;
commit;
select * from 예금통장;

drop table 예금통장;
#---------------------------------------------------------------------------------
create table 예금통장(
	예금주아이디 varchar(45) not null,
    예금주이름		varchar(45) not null,
    잔액			bigint(20) not null default 0,
    primary key(예금주아이디)
);
delimiter $$
create trigger before_예금통장_insert
	before insert on 예금통장
    for each row
    begin
		if new.잔액 < 0 then
			signal sqlstate '45000' set message_text = '잔액이 부족합니다';
		end if;
    end $$
delimiter ;

delimiter $$
create trigger before_예금통장_update
	before update on 예금통장
    for each row
    begin
    declare message_text varchar(45);
		if new.잔액 < 0 then
			signal sqlstate '45000' set message_text = '잔액이 부족합니다';
		end if;
    end $$
delimiter ;

insert into 예금통장 values('00000001','홍길동',4000);
insert into 예금통장 values('00000002','이순신',3000);
select * from 예금통장;

delimiter $$
create procedure 송금 (in 이체금액 int)
	begin
		declare exit handler for sqlexception rollback;
        start transaction;
			update 예금통장 set 잔액 = 잔액 - 이체금액 where 예금주아이디='00000001';
            update 예금통장 set 잔액 = 잔액 - 이체금액 where 예금주아이디='00000002';
		commit;
    end $$
delimiter ;

select * from 예금통장;
call 송금(5000);
select * from 예금통장;
call 송금(2000);
select * from 예금통장;



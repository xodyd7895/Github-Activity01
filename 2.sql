SET SQL_SAFE_UPDATES = 0;


create database market_db;
use market_db;
USE market_db;
CREATE TABLE member -- 회원 테이블
( mem_id  		CHAR(8) NOT NULL PRIMARY KEY, -- 사용자 아이디(PK)
  mem_name    	VARCHAR(10) NOT NULL, -- 이름
  mem_number    INT NOT NULL,  -- 인원수
  addr	  		CHAR(2) NOT NULL, -- 지역(경기,서울,경남 식으로 2글자만입력)
  phone1		CHAR(3), -- 연락처의 국번(02, 031, 055 등)
  phone2		CHAR(8), -- 연락처의 나머지 전화번호(하이픈제외)
  height    	SMALLINT,  -- 평균 키
  debut_date	DATE  -- 데뷔 일자
);
CREATE TABLE buy -- 구매 테이블
(  num 		INT AUTO_INCREMENT NOT NULL PRIMARY KEY, -- 순번(PK)
   mem_id  	CHAR(8) NOT NULL, -- 아이디(FK)
   prod_name 	CHAR(6) NOT NULL, --  제품이름
   group_name 	CHAR(4)  , -- 분류
   price     	INT  NOT NULL, -- 가격
   amount    	SMALLINT  NOT NULL, -- 수량
   FOREIGN KEY (mem_id) REFERENCES member(mem_id)
);

INSERT INTO member VALUES('TWC', '트와이스', 9, '서울', '02', '11111111', 167, '2015.10.19');
INSERT INTO member VALUES('BLK', '블랙핑크', 4, '경남', '055', '22222222', 163, '2016.08.08');
INSERT INTO member VALUES('WMN', '여자친구', 6, '경기', '031', '33333333', 166, '2015.01.15');
INSERT INTO member VALUES('OMY', '오마이걸', 7, '서울', NULL, NULL, 160, '2015.04.21');
INSERT INTO member VALUES('GRL', '소녀시대', 8, '서울', '02', '44444444', 168, '2007.08.02');
INSERT INTO member VALUES('ITZ', '잇지', 5, '경남', NULL, NULL, 167, '2019.02.12');
INSERT INTO member VALUES('RED', '레드벨벳', 4, '경북', '054', '55555555', 161, '2014.08.01');
INSERT INTO member VALUES('APN', '에이핑크', 6, '경기', '031', '77777777', 164, '2011.02.10');
INSERT INTO member VALUES('SPC', '우주소녀', 13, '서울', '02', '88888888', 162, '2016.02.25');
INSERT INTO member VALUES('MMU', '마마무', 4, '전남', '061', '99999999', 165, '2014.06.19');

INSERT INTO buy VALUES(NULL, 'BLK', '지갑', NULL, 30, 2);
INSERT INTO buy VALUES(NULL, 'BLK', '맥북프로', '디지털', 1000, 1);
INSERT INTO buy VALUES(NULL, 'APN', '아이폰', '디지털', 200, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '아이폰', '디지털', 200, 5);
INSERT INTO buy VALUES(NULL, 'BLK', '청바지', '패션', 50, 3);
INSERT INTO buy VALUES(NULL, 'MMU', '에어팟', '디지털', 80, 10);
INSERT INTO buy VALUES(NULL, 'GRL', '혼공SQL', '서적', 15, 5);
INSERT INTO buy VALUES(NULL, 'APN', '혼공SQL', '서적', 15, 2);
INSERT INTO buy VALUES(NULL, 'APN', '청바지', '패션', 50, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '지갑', NULL, 30, 1);
INSERT INTO buy VALUES(NULL, 'APN', '혼공SQL', '서적', 15, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '지갑', NULL, 30, 4);

SELECT * FROM member;
SELECT * FROM buy;

USE market_db;
DROP PROCEDURE IF EXISTS user_proc;
DELIMITER $$
CREATE PROCEDURE user_proc()
BEGIN
    SELECT * FROM member; -- 스토어드 프로시저 내용
END $$
DELIMITER ;

CALL user_proc();

DROP PROCEDURE user_proc;

USE market_db;
DROP PROCEDURE IF EXISTS user_proc1;
DELIMITER $$
CREATE PROCEDURE user_proc1(IN userName VARCHAR(10))
BEGIN
  SELECT * FROM member WHERE mem_name = userName; 
END $$
DELIMITER ;

CALL user_proc1('에이핑크');


DROP PROCEDURE IF EXISTS user_proc2;
DELIMITER $$
CREATE PROCEDURE user_proc2(
    IN userNumber INT, 
    IN userHeight INT  )
BEGIN
  SELECT * FROM member 
    WHERE mem_number > userNumber AND height > userHeight;
END $$
DELIMITER ;

CALL user_proc2(6, 165);


DROP PROCEDURE IF EXISTS user_proc3;
DELIMITER $$
CREATE PROCEDURE user_proc3(
    IN txtValue CHAR(10),
    OUT outValue INT     )
BEGIN
  INSERT INTO noTable VALUES(NULL,txtValue);
  SELECT MAX(id) INTO outValue FROM noTable; 
END $$
DELIMITER ;

DESC noTable;

CREATE TABLE IF NOT EXISTS noTable(
    id INT AUTO_INCREMENT PRIMARY KEY, 
    txt CHAR(10)
);

CALL user_proc3 ('테스트1', @myValue);
SELECT CONCAT('입력된 ID 값 ==>', @myValue);

DROP PROCEDURE IF EXISTS ifelse_proc;
DELIMITER $$
CREATE PROCEDURE ifelse_proc(
    IN memName VARCHAR(10)
)
BEGIN
    DECLARE debutYear INT; -- 변수 선언
    SELECT YEAR(debut_date) into debutYear FROM member
        WHERE mem_name = memName;
    IF (debutYear >= 2015) THEN
            SELECT '신인 가수네요. 화이팅 하세요.' AS '메시지';
    ELSE
            SELECT '고참 가수네요. 그동안 수고하셨어요.'AS '메시지';
    END IF;
END $$
DELIMITER ;

CALL ifelse_proc ('마마무');

SELECT YEAR(CURDATE()), MONTH(CURDATE()), DAY(CURDATE());


DROP PROCEDURE IF EXISTS while_proc;
DELIMITER $$
CREATE PROCEDURE while_proc()
BEGIN
    DECLARE hap INT; -- 합계
    DECLARE num INT; -- 1부터 100까지 증가
    SET hap = 0; -- 합계 초기화
    SET num = 1; 
    
    WHILE (num <= 100) DO  -- 100까지 반복.
        SET hap = hap + num;
        SET num = num + 1; -- 숫자 증가
    END WHILE;
    SELECT hap AS '1~100 합계';
END $$
DELIMITER ;

CALL while_proc();

DROP PROCEDURE IF EXISTS dynamic_proc;
DELIMITER $$
CREATE PROCEDURE dynamic_proc(
    IN tableName VARCHAR(20)
)
BEGIN
  SET @sqlQuery = CONCAT('SELECT * FROM ', tableName);
  PREPARE myQuery FROM @sqlQuery;
  EXECUTE myQuery;
  DEALLOCATE PREPARE myQuery;
END $$
DELIMITER ;

CALL dynamic_proc ('member');


-- ------------------------------
-- 2절
-- ------------------------------










SET GLOBAL log_bin_trust_function_creators = 1;

USE market_db;
DROP FUNCTION IF EXISTS sumFunc;
DELIMITER $$
CREATE FUNCTION sumFunc(number1 INT, number2 INT)
    RETURNS INT
BEGIN
    RETURN number1 + number2;
END $$
DELIMITER ;

SELECT sumFunc(100, 200) AS '합계';




DROP FUNCTION IF EXISTS calcYearFunc;
DELIMITER $$
CREATE FUNCTION calcYearFunc(dYear INT)
    RETURNS INT
BEGIN
    DECLARE runYear INT; -- 활동기간(연도)
    SET runYear = YEAR(CURDATE()) - dYear;
    RETURN runYear;
END $$
DELIMITER ;

SELECT calcYearFunc(2010) AS '활동햇수';

SELECT calcYearFunc(2007) INTO @debut2007;
SELECT calcYearFunc(2013) INTO @debut2013;
SELECT @debut2007-@debut2013 AS '2007과 2013 차이' ;

SELECT mem_id, mem_name, calcYearFunc(YEAR(debut_date)) AS '활동 햇수' 
    FROM member; 


SHOW CREATE FUNCTION calcYearFunc;

DROP FUNCTION calcYearFunc;


USE market_db;
DROP PROCEDURE IF EXISTS cursor_proc;
DELIMITER $$
CREATE PROCEDURE cursor_proc()
BEGIN
    DECLARE memNumber INT; -- 회원의 인원수
    DECLARE cnt INT DEFAULT 0; -- 읽은 행의 수
    DECLARE totNumber INT DEFAULT 0; -- 인원의 합계
    DECLARE endOfRow BOOLEAN DEFAULT FALSE; -- 행의 끝 여부(기본을 FALSE)

    DECLARE memberCuror CURSOR FOR-- 커서 선언
        SELECT mem_number FROM member;

    DECLARE CONTINUE HANDLER -- 행의 끝이면 endOfRow 변수에 TRUE를 대입 
        FOR NOT FOUND SET endOfRow = TRUE;

    OPEN memberCuror;  -- 커서 열기

    cursor_loop: LOOP
        FETCH  memberCuror INTO memNumber; 

        IF endOfRow THEN 
            LEAVE cursor_loop;
        END IF;

        SET cnt = cnt + 1;
        SET totNumber = totNumber + memNumber;        
    END LOOP cursor_loop;

    SELECT (totNumber/cnt) AS '회원의 평균 인원 수';

    CLOSE memberCuror; 
END $$
DELIMITER ;

CALL cursor_proc();


-- ------------------------------
-- 3절
-- ------------------------------

USE market_db;

CREATE TABLE IF NOT EXISTS trigger_table (id INT, txt VARCHAR(10));
INSERT INTO trigger_table VALUES(1, '레드벨벳');
INSERT INTO trigger_table VALUES(2, '잇지');
INSERT INTO trigger_table VALUES(3, '블랙핑크');

select * from trigger_table;

DROP TRIGGER IF EXISTS myTrigger;
DELIMITER $$ 
CREATE TRIGGER myTrigger  -- 트리거 이름
    AFTER  DELETE -- 삭제후에 작동하도록 지정
    ON trigger_table -- 트리거를 부착할 테이블
    FOR EACH ROW -- 각 행마다 적용시킴
BEGIN
    SET @msg = '가수 그룹이 삭제됨' ; -- 트리거 실행시 작동되는 코드들
END $$ 
DELIMITER ;

SET @msg = '';
INSERT INTO trigger_table VALUES(4, '마마무');
SELECT @msg;
UPDATE trigger_table SET txt = '블핑' WHERE id = 3;
SELECT @msg;

DELETE FROM trigger_table WHERE id = 4;
SELECT @msg;

USE market_db;

drop table singer;

CREATE TABLE singer (SELECT mem_id, mem_name, mem_number, addr FROM member);

SELECT * FROM singer;

DROP TABLE IF EXISTS backup_singer;

CREATE TABLE backup_singer
( mem_id  		CHAR(8) NOT NULL , 
  mem_name    	VARCHAR(10) NOT NULL, 
  mem_number    INT NOT NULL, 
  addr	  		CHAR(2) NOT NULL,
  modType  CHAR(2), -- 변경된 타입. '수정' 또는 '삭제'
  modDate  DATE, -- 변경된 날짜
  modUser  VARCHAR(30) -- 변경한 사용자
);

DROP TRIGGER IF EXISTS singer_updateTrg;
DELIMITER $$
CREATE TRIGGER singer_updateTrg  -- 트리거 이름
    AFTER UPDATE -- 변경 후에 작동하도록 지정
    ON singer -- 트리거를 부착할 테이블
    FOR EACH ROW 
BEGIN
    INSERT INTO backup_singer VALUES( OLD.mem_id, OLD.mem_name, OLD.mem_number, 
        OLD.addr, '수정', CURDATE(), CURRENT_USER() );
END $$ 
DELIMITER ;

DROP TRIGGER IF EXISTS singer_deleteTrg;
DELIMITER $$
CREATE TRIGGER singer_deleteTrg  -- 트리거 이름
    AFTER DELETE -- 삭제 후에 작동하도록 지정
    ON singer -- 트리거를 부착할 테이블
    FOR EACH ROW 
BEGIN
    INSERT INTO backup_singer VALUES( OLD.mem_id, OLD.mem_name, OLD.mem_number, 
        OLD.addr, '삭제', CURDATE(), CURRENT_USER() );
END $$ 
DELIMITER ;


UPDATE singer SET addr = '영국' WHERE mem_id = 'BLK';
DELETE FROM singer WHERE mem_number >= 7;

select*from singer;

SELECT * FROM backup_singer;

TRUNCATE TABLE singer;

SELECT * FROM backup_singer;

DROP TABLE accounts;
drop table account_changes;

create table accounts(
	account_no INTEGER NOT NULL,
	balance DECIMAL NOT NULL DEFAULT 0,
    PRIMARY KEY(account_no),
    CHECK(balance >=0)
);

CREATE TABLE account_changes(
	change_no INT NOT NULL PRIMARY KEY,
    account_no INTEGER NOT NULL,
    flag text NOT NULL,
    amount DECIMAL NOT NULL,
    changed_at Text NOT NULL
);

INSERT INTO accounts (account_no, balance) values (100,20100);
INSERT INTO accounts (account_no, balance) values (200, 10100);

select * from accounts;

BEGIN TRANSACTION;

UPDATE accounts
   SET balance = balance - 1000
 WHERE account_no = 100;

UPDATE accounts
   SET balance = balance + 1000
 WHERE account_no = 200;
 
INSERT INTO account_changes(account_no,flag,amount,changed_at) 
VALUES(100,'-',1000,datetime('now'));

INSERT INTO account_changes(account_no,flag,amount,changed_at) 
VALUES(200,'+',1000,datetime('now'));

COMMIT;

select * from accounts;
select * from account_changes;

drop table employee;

create table Students(
	StudentID int PRIMARY KEY NOT NULL,
    LastName varchar(20) not null,
    FirstName varchar(20) not null,
    Graduation int not null);

SELECT * FROM Students;
insert into Students(StudentID, LastName, FirstName ,Graduation) values (2, 'Kim', 'TY',2019);
insert into Students(StudentID, LastName, FirstName ,Graduation) values (3, 'Ho', 'TE',2020);

create table StudentArchieve(
	StudentID int PRIMARY KEY NOT NULL,
    LastName varchar(20) not null,
    FirstName varchar(20) not null,
    Graduation int not null);
    
insert into StudentArchieve(StudentID, LastName, FirstName ,Graduation) values (1, 'Jung', 'Jung',1840);
insert into StudentArchieve(StudentID, LastName, FirstName ,Graduation) values (4, 'Kim', 'Jung',1936);
insert into StudentArchieve(StudentID, LastName, FirstName ,Graduation) values (5, 'Kim', 'Kim',1928);
insert into StudentArchieve(StudentID, LastName, FirstName ,Graduation) values (6, 'Jang', 'baek',1942);

select * from studentarchieve;

drop table bankaccounts;

CREATE TABLE bankaccounts(accountno varchar(20) PRIMARY KEY NOT NULL, funds decimal(8,2));

INSERT INTO bankaccounts VALUES("ACC1", 1000);
INSERT INTO bankaccounts VALUES("ACC2", 1000);

START TRANSACTION; 
UPDATE bankaccounts SET funds=funds-100 WHERE accountno='ACC1'; 
UPDATE bankaccounts SET funds=funds+100 WHERE accountno='ACC2'; 
COMMIT; 

select * from bankaccounts;

START TRANSACTION; 
UPDATE bankaccounts SET funds=funds-100 WHERE accountno='ACC1'; 
UPDATE bankaccounts SET funds=funds+100 WHERE accountno='ACC2';
ROLLBACK; 

START TRANSACTION;
SELECT * FROM bankaccounts;
COMMIT;

SET AUTOCOMMIT = 0;
SET AUTOCOMMIT = OFF;

SHOW VARIABLES LIKE 'AUTOCOMMIT';



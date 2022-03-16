use kmong;
select * from users;
create table users(
    id varchar(20) primary key,
    pwd varchar(20),
    name varchar(20),
    email varchar(40),
    zip_code varchar(7),
    address varchar(100),
    phone varchar(20)
    ) character set utf8;

select * from users;
insert into users(id, pwd, name, email, zip_code, address, phone) values ('xodyd','123456','김용용','xodyd@naver.com','1234','경기도','01012341233');
insert into users(id, pwd, name, email, zip_code, address, phone) values ('xodyd1','1232456','김용용1','xodyd1@naver.com','123334','서울','01042341233');
insert into users(id, pwd, name, email, zip_code, address, phone) values ('xodyd2','1234356','김용용2','xodyd2@naver.com','123443','강원도','01042341233');
insert into users(id, pwd, name, email, zip_code, address, phone) values ('xodyd3','1234546','김용용3','xodyd3@naver.com','123434','부산','01012341233');
insert into users(id, pwd, name, email, zip_code, address, phone) values ('xodyd4','1234567','김용용4','xodyd4@naver.com','1234','경기도','01012341233');
insert into users(id, pwd, name, email, zip_code, address, phone) values ('xodyd5','1234568','김용용5','xodyd5@naver.com','1234','경기도','01012341233');
insert into users(id, pwd, name, email, zip_code, address, phone) values ('xodyd6','1234569','김용용6','xodyd6@naver.com','1234','경기도','01012341233');
insert into users(id, pwd, name, email, zip_code, address, phone) values ('xodyd7','12345610','김용용7','xodyd7@naver.com','1234','경기도','01012341233');
insert into users(id, pwd, name, email, zip_code, address, phone) values ('xodyd8','12345611','김용용8','xodyd8@naver.com','1234','경기도','01012341233');
insert into users(id, pwd, name, email, zip_code, address, phone) values ('xodyd9','12345612','김용용9','xodyd9@naver.com','1234','경기도','01012341233');




    create table product(
    prodnum int(5) primary key,
    name varchar(200) default 0,
    kind char(1), 
    price1 int(7) default 0,
    content varchar(1000) default null,
    image varchar(50) default 'default.jpg'
    ) character set utf8;
    
    select * from product;
    insert into product(prodnum, name, kind, price1, content, image) values(0101, '나비와 꽃','화','1000000','mysql is blah blah', 'image');
    insert into product(prodnum, name, kind, price1, content, image) values(0102, 's낙서1','화','4400000','mysql is blah blah1', 'image');
    insert into product(prodnum, name, kind, price1, content, image) values(0103, '낙서2','화','15000000','mysql is blah blah2', 'image');
    
    insert into product(prodnum, name, kind, price1, content, image) values(0104, '낙서3','1','30000000','blah blah3', 'image');
    insert into product(prodnum, name, kind, price1, content, image) values(0105, '낙서4','2','40000000','blah blah4', 'image');
    insert into product(prodnum, name, kind, price1, content, image) values(0106, '낙서5','1','55000000','blah blah5', 'image');
    insert into product(prodnum, name, kind, price1, content, image) values(0107, '낙서6','1','15100000','blah blah6', 'image');
    insert into product(prodnum, name, kind, price1, content, image) values(0108, '낙서7','1','18000000','blah blah7', 'image');
    insert into product(prodnum, name, kind, price1, content, image) values(0109, '낙서8','1','80000000','blah blah8', 'image');
    insert into product(prodnum, name, kind, price1, content, image) values(01010, '낙서9','1','45000000','blah blah9', 'image');
    
    
    create table cart(
    cartnum int(8) primary key,
    id varchar(20),
    prodnum int(5),
    quantity int(5) default 1,
    result char(1) default 1, -- 배송 전 : 1, 배송 완료 : 2
    indate date
    ) character set utf8;-- 카트 담은 날짜
    
    select * from cart;
    insert into cart (cartnum, id, prodnum, quantity, result, indate) values (12, 'xodyd',0101,3,'1','2022-03-15');
    insert into cart (cartnum, id, prodnum, quantity, result, indate) values (13, 'xodyd1',0102,1,'2','2022-03-15');
    insert into cart (cartnum, id, prodnum, quantity, result, indate) values (14, 'xodyd2',0102,2,'1','2022-03-15');
    insert into cart (cartnum, id, prodnum, quantity, result, indate) values (15, 'xodyd3',0101,1,'2','2022-03-15');
    
    insert into cart (cartnum, id, prodnum, quantity, result, indate) values (16, 'xodyd4',0101,1,'1','2022-03-16');
    insert into cart (cartnum, id, prodnum, quantity, result, indate) values (17, 'xodyd4',0102,1,'2','2022-03-15');
    insert into cart (cartnum, id, prodnum, quantity, result, indate) values (18, 'xodyd5',0102,1,'1','2022-03-15');
    insert into cart (cartnum, id, prodnum, quantity, result, indate) values (19, 'xodyd6',0101,1,'2','2022-03-15');
    insert into cart (cartnum, id, prodnum, quantity, result, indate) values (20, 'xodyd7',0101,1,'1','2022-03-16');
    insert into cart (cartnum, id, prodnum, quantity, result, indate) values (21, 'xodyd8',0102,1,'2','2022-03-16');
   
    create table orders(
    ordernum int(10) primary key,
    id varchar(20),
    indate date);
    
    select * from orders;
    insert into orders(ordernum, id, indate) values (123, 'xodyd1', '2022-03-15');
    insert into orders(ordernum, id, indate) values (124, 'xodyd1', '2022-03-15');
    insert into orders(ordernum, id, indate) values (125, 'xodyd2', '2022-03-15');
    insert into orders(ordernum, id, indate) values (126, 'xodyd3', '2022-03-15');
    insert into orders(ordernum, id, indate) values (127, 'xodyd1', '2022-03-15');
    insert into orders(ordernum, id, indate) values (128, 'xodyd1', '2022-03-15');
    
	insert into orders(ordernum, id, indate) values (129, 'xodyd5', '2022-03-16');
    insert into orders(ordernum, id, indate) values (130, 'xodyd4', '2022-03-15');
    insert into orders(ordernum, id, indate) values (131, 'xodyd8', '2022-03-16');
    insert into orders(ordernum, id, indate) values (132, 'xodyd4', '2022-03-15');
    
    
    
    create table order_detail(
    odnum int(10) primary key,
    ordernum int(10),
    prodnum int(5),
    quantity int(5),
    result char(1) default 1);
    
    select * from order_detail;
    insert into order_detail(odnum, ordernum, prodnum, quantity, result) values (110, 123, 0101, 1, 1);
    
	insert into order_detail(odnum, ordernum, prodnum, quantity, result) values (111, 124, 0101, 1, 1);
	insert into order_detail(odnum, ordernum, prodnum, quantity, result) values (112, 124, 0102, 2, 2);
	insert into order_detail(odnum, ordernum, prodnum, quantity, result) values (113, 125, 0101, 3, 1);
	insert into order_detail(odnum, ordernum, prodnum, quantity, result) values (114, 126, 0105, 4, 2);
	insert into order_detail(odnum, ordernum, prodnum, quantity, result) values (115, 127, 0107, 5, 1);
	insert into order_detail(odnum, ordernum, prodnum, quantity, result) values (116, 128, 0108, 6, 2);
	insert into order_detail(odnum, ordernum, prodnum, quantity, result) values (117, 129, 0104, 7, 1);
	insert into order_detail(odnum, ordernum, prodnum, quantity, result) values (118, 130, 0105, 8, 2);
	insert into order_detail(odnum, ordernum, prodnum, quantity, result) values (119, 123, 0108, 9, 1);
    
    create table qna(
    qseq int(5) primary key,
    subject varchar(30),
    content varchar(1000),
    reply varchar(1000),
    id varchar(20),
    rep char(1) default 1,
    indate date);
    
    alter table qna add( 비고 varchar(20) default 'N/A');
    select * from qna;
    insert into qna(qseq, subject, content, reply, id, rep, indate) values (00001, '문의','안녕하세요...', '해당 내용 확인...', 'xodyd1','1', '2021-01-15','N/A');
    insert into qna(qseq, subject, content, reply, id, rep, indate) values (00002, '문의','안녕하세요...', '해당 내용 확인...', 'xodyd2','2', '2022-01-15');
    insert into qna(qseq, subject, content, reply, id, rep, indate) values (00003, '문의','안녕하세요...', '해당 내용 확인...', 'xodyd1','1', '2022-03-15');
    insert into qna(qseq, subject, content, reply, id, rep, indate) values (00004, '문의','안녕하세요...', '해당 내용 확인...', 'xodyd3','1', '2022-02-15');
    insert into qna(qseq, subject, content, reply, id, rep, indate) values (00005, '문의','안녕하세요...', '해당 내용 확인...', 'xodyd4','1', '2022-02-17');
    insert into qna(qseq, subject, content, reply, id, rep, indate) values (00006, '후기','안녕하세요...', '해당 내용 확인...', 'xodyd5','1', '2022-03-15');
    insert into qna(qseq, subject, content, reply, id, rep, indate) values (00007, '문의','안녕하세요...', '해당 내용 확인...', 'xodyd8','2', '2022-03-15');
    insert into qna(qseq, subject, content, reply, id, rep, indate) values (00008, '문의','안녕하세요...', '해당 내용 확인...', 'xodyd5','1', '2022-03-15');
    insert into qna(qseq, subject, content, reply, id, rep, indate) values (00009, '문의','안녕하세요...', '해당 내용 확인...', 'xodyd7','1', '2022-03-15');
    insert into qna(qseq, subject, content, reply, id, rep, indate) values (00010, '문의','안녕하세요...', '해당 내용 확인...', 'xodyd6','1', '2022-03-15');
	
    
select * from orders;
show index from orders;
create index 인덱스 on orders(id);

select * from orders inner join order_detail on orders.ordernum = order_detail.ordernum;


select * from view_1;
desc view_1;
drop view view_1;
create view view_1 as 
select users.id,pwd,name,address, phone, orders.indate 
from users, orders where users.id = orders.id;
desc view_1;

drop view view_5;
select * from view_5;

create view view_5 as
select users.id,pwd,name,address,phone, cart.prodnum,cart.quantity,cart.indate
from users, cart where users.id=cart.id;

alter view view_1 as
select view_2.prodnum,quantity  from qna;

drop view view_1;
drop view view_2;
drop view view_3;
drop view view_4;
drop view view_5;

create view view_2 as
select users.id,pwd,name,address,phone, qna.subject, content, indate 
from users, qna where users.id=qna.id;
select * from view_2;

create view view_6 as
select users.pwd,name,address,phone,qna.subject,qna.content,qna.indate, orders.id,ordernum
from users, qna, orders where qna.id =orders.id;

select * from view_6;

drop view view_6;

select * from ( select * from qna order by indate) as qna_desc group by id;
select * from (select * from cart order by id) as cart_desc group by id;
select * from product;
select product.name, price1,prodnum, content
from product product where price1 > (select avg(product.price1)
					from product);


select indate, indate+1, indate-1 from qna;
select to_char(sysdate,'YYYY-MM-DD Day') from qna;

select cart1.id, cart1.cartnum, cart1.indate, cart2.id
from cart cart1, cart cart2
where cart1.id = cart2.id; 

select view_1.id, pwd, name,address,phone,indate, view_2.subject,content,indate
from view_2 
left outer join view_2 as view_4 on view_1.id = view_2.id;
create view view_1 as 
select users.id,pwd,name,address, phone, orders.indate from users, 
orders where users.id = orders.id;

drop view view_4;
create view view_4 as
select view_1.id,view_1.name,view_1.address,view_1.phone, 
view_2.subject,content,view_2.indate from view_2
inner join view_1 on view_1.id=view_2.id;

select distinct *  from view_4


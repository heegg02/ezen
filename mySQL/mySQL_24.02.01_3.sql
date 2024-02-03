#create table producttbl(pcode char(6) primary key, price int, amount int, maker varchar(20), mdate date);

#insert into producttbl(pcode, price, amount, maker, mdate) values('ss1256', 1250000, 5, '삼성', '2024-01-15');

#insert into producttbl values('lg4711', 800000, 12, '엘지', '2024-01-17');

#insert into producttbl(pcode, pname, amount, price, maker) values('ss7847', '청소기', 7, 300000, '삼성');

#create table personaltbl(no int auto_increment primary key, name varchar(10), age int);
# auto_increment : 자동 증가, primary key : 유일 데이터(중복 x)
#drop table personaltbl;

#insert into personaltbl values(null, '김철수', 26);
#insert into personaltbl values(null, '이영희', 23), (null, '박찬호', 40), (null, '손흥민', 32);

#create table emptbl(id int, fname varchar(50), lname varchar(50));

insert into emptbl(select emp_no, first_name, last_name from employees.employees);
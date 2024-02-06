-- delimiter $$
-- create procedure probase()
-- begin
-- 	declare num int;
--     set num = 30;
--     if num > 100 then
-- 		select '100보다 큰 수군요';
-- 	else
-- 		select '100보다 작은 수군요';
-- 	end if;
-- end $$
-- delimiter probase;

#call probase();

#update empcopy set hiredate ='2022-10-25' where ename='홍길동';
#update empcopy set hiredate ='2023-07-10' where ename='박찬호';

-- delimiter $$
-- create procedure proemp()
-- begin
-- 	declare hDate date; -- 입사일자를 담을 변수 선언 
--     declare cDate date; -- 오늘날짜를 담을 변수 선언
--     declare days int; -- 근무한 일수를 담을 변수 선언
--     declare name varchar(10); -- 이름
--     select hiredate, ename into hDate, name from empcopy where eno = 8000;
-- 	set cDate=current_date();
--     set days = datediff(cDate, hDate);
--     if(days > 365) then
-- 		select concat(name, '님 입사한지 ',(days/365), '년이 지났군요.') as 결과;
-- 	else
-- 		select concat(name, '님 입사한지 1년이 안되었네요. 정진하세요') as 결과;
-- 	end if;
-- end $$
-- delimiter ;

-- delimiter $$
-- create procedure prodept(no int) -- 매개변수로 사원번호를 no에 받음
-- begin
-- 	declare dname varchar(15); -- 부서명 
--     declare name varchar(10); -- 이름
--     declare dtno int; -- 부서번호
--     select ename, dno into name, dtno from empcopy where eno=no;
-- 	case
-- 		when dtno = 10 then
-- 			set dname = '회계부';
-- 		when dtno = 20 then
-- 			set dname = '마케팅부';
-- 		when dtno = 30 then
-- 			set dname = '영업부';
-- 		when dtno = 40 then
-- 			set dname = '총무부';
-- 		when dtno = 50 then
-- 			set dname = '개발부';
-- 		else
-- 			set dname = '미정';
-- 	end case;
--     select concat(name, '님의 소속 부서는 ', dname,'입니다.') as '결과';
-- end $$
-- delimiter ;

-- delimiter $$
-- create procedure progugu(dan int) -- 매개변수로 사원번호를 no에 받음
-- begin
--     declare i int; -- 부서번호
--     declare str varchar(200);
--     set i = 1;
--     set str = '';
--     while (i<=9) do
--         set str = concat(dan, 'x', i,'=', dan*i, ' ');
--         set i=i+1;
-- 	end while;
--     select str as '결과';
-- end $$
-- delimiter ;

#set global log_bin_trust_function_creators=1;

-- delimiter $$
-- create function funcAdd(num1 int, num2 int)
-- 	returns int
-- begin
-- 	declare hap int;
--     set hap = num1 + num2;
-- 	return hap;
-- end $$
-- delimiter ;

#select funcAdd(13,60);

# 출생연도를 입력하면 나이를 계산해주는 함수를 생성하시오.

-- delimiter $$
-- create function funcAge(bDate date)
-- 	returns int
-- begin
-- 	declare cDate date;
--     declare Age int;
--     set cDate=current_date();
--     set Age = datediff(cDate, bDate)/365;
--     return Age;
-- end $$
-- delimiter ;

#select ezenldb.funcAge('2002-03-01') as 나이;

# 1981년도에 입사한 사원의 이름과 입사 일을 출력하시오. and 연산자, between 연산자, like 연산자
#select ename, hiredate from empcopy where HIREDATE>='1981-01-01' and HIREDATE<'1982-01-01';
#select ename, hiredate from empcopy where HIREDATE between '1981-01-01' and '1982-01-01';
#select ename, hiredate from empcopy where HIREDATE like '1981%';

# 사원의 이름, 급여, 연간 총수입을 총수입이 많은 직원부터 출력하시오. (연간 총수입은 월급에 12를 곱한 후 상여금 100을 더해서 계산)
#select ename, salary, (salary*12)+100 as '연간 총 수입' from empcopy order by (salary*12)+100 desc;

# 이름에 A와 E를 모두 포함하고 있는 사원의 모든 정보를 출력하시오.
#select * from empcopy where ename like '%a%' and ename like '%e%';
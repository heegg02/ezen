#insert into producttbl values('ds6351', 960000, 15, '다이슨', '2024-01-20', '청소기');
#insert into producttbl values('lg7841', 650000, 10, '엘지', '2024-01-25', '스마트TV');

#update producttbl set maker = 'LG' where maker = '엘지';
#update producttbl set pname = '세탁기' where pcode = 'lg4711'

#update producttbl set price = price * 1.1 where maker = '삼성';

#delete from emptbl;

#delete from producttbl where pcode = 'ds6351'

#select if(10>20, '참입니다.', '거짓입니다.')

#select ifnull(null, 'null입니다.');
#select ifnull(22, 'null입니다.');

-- select case 1
-- 		when 1 then 'vip회원'
-- 		when 2 then '우수회원'
-- 		when 3 then '일반회원'
-- 		else '비회원'
-- 		end as '회원정보';

#select pcode, price, if(price>1000000, '고가제품', '일반제품') as '제품분류', maker from producttbl;

#select pcode, price, amount, ifnull(mdate, '입고날짜미정') as mdate, maker from producttbl;

-- select no, name, age, case grade
-- 		when 1 then 'VIP회원'
-- 		when 2 then '우수회원'
-- 		when 3 then '일반회원'
-- 		else '비회원'
-- 		end as '회원정보' from personaltbl;


#select length('korea') as 문자열길이;

#select concat('우리모두', '파이팅');

#select elt(1, '손흥민', '김철수', '박찬호');

#select field('손흥민', '김철수', '손흥민', '박찬호');

#select format(3512.5213, 2)
#select emp_no, format(avg(salary), 2) from employees.salaries group by emp_no;

#select left('computer', 3);
#select right('computer', 3);

#select ltrim('  홍길동');
#select rtrim('홍길동  ');
#select trim('  홍길동  ');

#select repeat('DB', 3);

#select replace('지금은 자바 공부중', '자바', 'mySQL');

#select reverse('korea');

#select substring('computer', 3, 3);

#select substring_index('cafe.naver.com', '.', 2);
#select substring_index('cafe.naver.com', '.', -2);

#select lower('KOREA');
#select upper('korea');
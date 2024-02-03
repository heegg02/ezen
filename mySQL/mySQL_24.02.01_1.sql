#select * from employees;
#select * from employees.titles;
#select first_name, birth_date, gender from employees;

#use employees;
#show table status;

#desc employees; # desc 테이블 구조 확인

#select first_name as 이름, birth_date as 생년월일, gender as 성별 from employees;

#select * from employees where first_name = 'mary';

#select * from employees.salaries where salary >= 60000;

#select * from employees where gender = 'f';

#select * from employees where birth_date >= '1960-01-01';

# 1960년이후에 입사한 직원들 중에 first_name이 'Mary' 인 자료를 검색하시오.
#select * from employees where hire_date >= '1990-01-01' and first_name = 'mary';

# 급여(salaries)테이블 급여(salary)가 60000 ~ 80000 사이에 있는 직원만 검색하시오.
#select * from employees.salaries where salary >= 60000 and salary <= 80000;
#select * from employees.salaries where salary between 60000 and 80000;

#select emp_no, title from employees.titles where title = 'Staff' or title = 'Engineer';
#select emp_no, title from employees.titles where title in('Engineer','Staff');

#select * from employees where first_name like 'M%';
# 'M%'(M으로 시작), '%M'(M으로 끝나는), '%M%'(M을 포함하는),
# 'M___'(M으로 시작하는 4자), '_M%'(2번째 글자가 M인)

# 사원번호 10002 사원과 같은 title을 가진 직원들을 검색하시오.
#select * from employees.titles where title = (select title from titles where emp_no = 10002);

#select * from employees order by hire_date desc;
# order by (정렬) : 열이름 순서(asc, desc)

# 이름이 sumant(first_name), peac(last_name)과 같은 날짜에 입사한 사원들을 검색하시오.(SubQuery 활용)
#select * from employees where hire_date = (select hire_date from employees where first_name = 'sumant' and last_name = 'peac');

#select * from employees where hire_date = any(select hire_date from employees where first_name = 'Mary');
#select * from employees where hire_date in(select hire_date from employees where first_name = 'Mary');

#select * from employees where gender = 'F' order by hire_date desc, first_name asc;

# 우리 회사의 title 종류는 몇 개인지 : distinct(중복 배제)
#select distinct title from titles;

# limit 10: 상위 10 개 , limit 5,10 : 5번째부터 10 개
#select * from employees order by hire_date asc limit 10;
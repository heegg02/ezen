#insert into employee values(8000, '홍길동', 'CLERK', 7369, '2024-02-05', 700, null, 40);

#insert into department values(50, 'DEVELOPMMENT', 'SEOUL');

#insert into employee values(8001, '박찬호', 'SALESMAN', 7499, '2024-02-05', 700, null, 50);

# 사원정보 테이블에서 사원명, 업무명, 월급여, 연봉 출력하시오. 
#select ename, job, salary, salary*12 as '연봉' from employee

#select * from employee where salary >= 1500;
#select * from employee where dno = 10;
#select * from employee where ename = 'scott';

# 1981-01-01 이전에 입사한 사원만 검색하시오.
#select * from employee where HIREDATE <= '1981-01-01'

# 근무부서가 10번 부서의 근무하면서 업무가 'manager'인 직원만 검색하시오.
#select * from employee where dno = 10 and job = 'MANAGER'; #dno = 10 or job = 'MANAGER';

# 10번 부서의 소속된 사원을 제외한 나머지 사원의 정보를 출력하시오.
#select * from employee where not dno = 10;

# 급여가 1000에서 1500 사이인 사원만 출력하시오.
#select * from employee where salary >= 1000 and salary <= 1500;
#select * from employee where salary between 1000 and 1500;

#select * from employee where salary not between 1000 and 1500;

#select * from employee where dno in(20,30,50);
#select * from employee where dno not in(20,30,50);

#select * from employee where ename like '_A%';
#select * from employee where ename not like '_A%';

#select * from employee where COMMISSION is null;
#select * from employee where COMMISSION is not null;

#select * from employee where COMMISSION is not null order by COMMISSION desc;

# 부서별 급여 합계를 구하여 출력하시오.
#select dno, sum(salary) as '급여 합계' from employee group by dno;
#select dno, avg(salary) as '급여 합계' from employee group by dno;

# 부서별 급여 합계를 구하여 출력하시오. 단 급여합계가 3000이 넘는 부서만 출력
#select dno, sum(salary) as '급여 합계' from employee group by dno having sum(SALARY)>=3000;

# 사원번호가 7788인 사원과 동일한 부서에서 근무하는 사원들을 출력하시오. (사원번호, 사원이름, 부서이름, 업무명, 월급여)
#select e.eno as '사원번호', e.ename as '사원이름', d.dname as '부서이름', e.job as '업무명', e.salary as '월급여' from employee e inner join department d on e.dno = d.dno where e.dno = (select dno from employee where eno='7788');

# 각 직원의 직속상관 이름을 출력하시오.
#select e.ename as '직원', ee.ename as '직속상관' from employee e inner join employee ee on e.manager = ee.eno;
#select e.ename as '직원', ee.ename as '작속상관' from employee e left outer join employee ee on e.manager = ee.eno;
#select e.ename as '직원', ee.ename as '작속상관' from employee e left outer join employee ee on e.manager = ee.eno;

#select * from employee cross join department;

# ALlen 사원보다 급여가 많은 사원들을 출력하시오. (사원명, 급여)
#select ename, salary from employee where SALARY > (select salary from employee where ename ='allen')

# 최고 급여를 받는 사원의 이름, 담당업무, 급여를 출력하시오.
#select ename, job, salary from employee where SALARY = (select max(salary) from employee);
# 최소 급여를 받는 사원의 이름, 담당업무, 급여를 출력하시오.
#select ename, job, salary from employee where SALARY = (select min(salary) from employee);

# 각 부서의 최소 급여를 받는 사원의 이름, 업무, 급여, 부서번호를 출력하시오.
#select dno, ename, job, salary from employee where SALARY in (select min(salary) from employee group by dno) order by dno asc;

#create table empcopy (select * from employee);
#create table empcopy2 (select eno, ename, salary from employee where dno = 20);
#create table empcopy3 (select eno, ename, salary*12 from employee where dno = 30);

#drop table empcopy3;

#create table empcopy3 (select eno, ename, salary*12 as annsal from employee where dno = 30);

#alter table empcopy2 add email varchar(30);

#alter table empcopy2 change ename ename varchar(15);

#alter table empcopy2 drop column email;

#insert into empcopy2(eno, ename) values(8500, '손흥민');

#select eno, ename, job from employee;

#create view v_emp as select eno, ename, job from employee;

select * from v_emp;
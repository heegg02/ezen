# 사원번호가 7788사원의 부서번호를 10으로 수정하시오.
#update empcopy set dno = 10 where eno = 7788;

# 사원번호 7788의 담당업무 및 급여를 7499의 담당업무 및 급여와 일치하도록 갱신하시오. 
#update empcopy set job, salary=(select job, salary from empcopy where eno = 7499) where eno = 7788; (오라클의 경우 가능)
#update empcopy set job = (select job from (select job from empcopy where eno = 7499) as emp1), salary = (select salary from (select salary from empcopy where eno = 7499) as emp2) where eno = 7788;

# 사원번호 7788의 담당업무를 salesman, 급여를 1600으로 수정하시오.
#update emcopy set job = 'salesman', salary = 1600 where eno = 7788;

#update employee set job = 'ClERK' where ename = '박찬호';

#update v_emp set ename = '박찬순' where eno = 8001;

#create view v_empdb as select e.eno, e.ename, d.dname, e.job from employee e inner join department d on e.dno = d.dno;

# 원본테이블인 employee를 이용하여 job이 salesman인 정보만 볼 수 있는 뷰를 생성하시오.
#create view v_empjob as select * from employee where job ='salesman';

#insert into v_empjob (eno, ename, job, manager, hiredate) values(8320, '이영표', 'SALESMAN', 7698, '2024-02-06');

#insert into v_empjob (eno, ename, job, manager, hiredate) values(8330, '이동국', 'CLERK', 7902, '2024-02-06');

#create view v_emp_manager as select * from employee where job = 'manager' with check option;

#insert into v_emp_manager (eno, ename, job) values(9000, '김민재', 'MANAGER');

#insert into v_emp_manager (eno, ename, job) values(9100, '박지성', 'SALESMAN');
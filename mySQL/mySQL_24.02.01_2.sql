#create table empcopy(select * from employees);
#select * from empcopy;

#create table empcopy2(select emp_no, first_name, last_name from employees);
#select * from empcopy2;

#select * from salaries;
#select emp_no, count(salary) from salaries  group by emp_no;

select emp_no, sum(salary) from salaries  group by emp_no having sum(salary) > 1000000;

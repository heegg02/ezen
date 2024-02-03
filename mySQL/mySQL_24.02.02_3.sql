# 사원정보 정보테이블(employees)과 업무정보테이블(titles) 이용하여 사원번호(emp_no), 사원이름(first_name, last_name), 업무(title), 입사일자(hire_date)를 출력하시오.
#select e.emp_no, e.first_name, e.last_name, t.title, e.hire_date from employees e inner join titles t on e.emp_no=t.emp_no;
#select e.emp_no, e.first_name, e.last_name, t.title, e.hire_date from employees e inner join titles t on e.emp_no=t.emp_no where t.title in ('staff', 'engineer')

# 사원들의 연봉 정보를 출력하는 쿼리문을 완성하시오.
# 사원번호(emp.no), 사원이름(first_name, last_name), 연봉(salary) 순으로 출력 다만 연봉 날짜가 가장 최근 값만
#select e.emp_no as '사원코드', concat(e.first_name,'-',e.last_name) as '사원명', s.salary as '연봉' from employees e inner join salaries s on e.emp_no=s.emp_no where s.to_date = '9999-01-01';

# 사원들이 어느 부서에서 근무하는지를 출력하는 쿼리문을 출력하시오. 사원코드, 사원명, 부서명
#select e.emp_no as 사원코드, concat(e.first_name,'-',e.last_name) as '사원명', dp.dept_name as 부서명 from employees e inner join dept_emp de on e.emp_no = de.emp_no inner join departments dp on de.dept_no = dp.dept_no;


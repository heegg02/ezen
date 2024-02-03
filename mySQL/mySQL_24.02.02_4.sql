-- insert into emptbl2 values(10001, '나사장', '010-1111-1111', null);
-- insert into emptbl2 values(10002, '김차장', '010-2222-2222', '나사장');
-- insert into emptbl2 values(10003, '이부장', '010-3333-3333', '나사장');
-- insert into emptbl2 values(10004, '김철수', '010-5555-1111', '이부장');
-- insert into emptbl2 values(10005, '이영희', '010-5555-2222', '이부장');
-- insert into emptbl2 values(10006, '박찬호', '010-5555-3333', '김차장');
-- insert into emptbl2 values(10007, '이영표', '010-5555-4444', '김차장');
-- insert into emptbl2 values(10008, '손흥민', '010-5555-5555', '김차장');

#select name, phone from emptbl2 where id=10006;

# 박창호의 직속상관 전화번호 출력하시오. 직원이름, 직속상관이름, 직속상관전화번호
#select e1.name as '직원이름', e1.manager as '직속상관이름', e2.phone as '직속상관전화번호' from emptbl2 e1 inner join emptbl2 e2 on e1.manager=e2.name where e1.name='박찬호'

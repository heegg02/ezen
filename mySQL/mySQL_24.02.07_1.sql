# 성적 처리 테이블 생성
#create table sungjuktbl(hakbun int primary key auto_increment, hname varchar(15), kor int, eng int, mat int, tot int, ave float, rank int);

#desc sungjuktbl;

# 사원정보 테이블에서 사원이 퇴사를 하면 사원정보 테이블 삭제작업이 수행한다. 퇴사사원을 관리하기 위한 테이블을 생성해서 트리거를 입력작업이 이루어지도록 한다.
#create table empback (select * from empcopy where false) # select 조건 false 하여 테이블 구조만 복사 

-- delimiter //
-- create trigger emp_del_back
-- 	after delete
--     on empcopy
--     for each row
-- begin
-- 	insert into empback values(old.eno, old.ename, old.job, old.manager, old.hiredate, old.salary, old.commission, old.dno);
-- end //
-- delimiter ;

#delete from empcopy where ename = '홍길동';
#delete from empcopy where ename = '박찬호';

# 성적 테이블에 이름, 국어, 영어, 수학 점수를 입력(insert)하면 총점과 평균이 자동 계산되도록하는 트리거를 만드시오. (mySQL 불가)
-- delimiter //
-- create trigger sung_auto_totave
-- 	after insert
--     on sungjuktbl
--     for each row
-- begin
-- 	update sungjuktbl set tot = kor + eng + mat;
--     update sungjuktbl set ave = (kor, eng, mat)/3;
-- end //
-- delimiter ;

#insert into sungjuktbl (hname, kor, eng, mat) values('김철수', 80, 76, 70);

#drop trigger if exists sung_auto_totave;

-- delimiter //
-- create trigger sung_auto_totave
-- 	before insert
--     on sungjuktbl
--     for each row
-- begin
-- 	set new.tot = new.kor + new.eng + new.mat;
--     set new.ave = (new.kor + new.eng + new.mat)/3;
-- end //
-- delimiter ;

#insert into sungjuktbl (hname, kor, eng, mat) values('이영희', 99, 96, 90);
#insert into sungjuktbl (hname, kor, eng, mat) values('박찬호', 76, 86, 80);
#insert into sungjuktbl (hname, kor, eng, mat) values('이영표', 67, 66, 60);
#insert into sungjuktbl (hname, kor, eng, mat) values('손흥민', 80, 77, 67);

-- delimiter $$
-- create procedure sung_rank()
-- begin
-- 	declare hbun int;
--     declare temprank int; # 임시변수
--     declare endRow boolean default false;
--     declare mycur cursor for # 커서 선언
-- 		select hakbun from sungjuktbl order by tot desc;
--     declare continue handler # 더 이상 읽을 행이 없을 경우 설정
-- 		for not found set endRow = true;
-- 	open mycur; # 커서 열기
-- 	set temprank = 1;
--     cursor_loop:LOOP
-- 		fetch mycur into hbun;
--         if endRow then
-- 			leave cursor_loop;
--         end if;
--         update sungjuktbl set hrank = temprank where hakbun = hbun;
--         set temprank = temprank+1;
-- 	end loop cursor_loop;
--     close mycur; # 커서 닫기
-- end $$
-- delimiter ; 

#insert into sungjuktbl (hname, kor, eng, mat) values('김민재', 97, 99, 100);
#insert into sungjuktbl (hname, kor, eng, mat) values('류현진', 20, 47, 30);
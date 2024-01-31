package statement;

public class ForStatement01 {

	public static void main(String[] args) {
		//조건문 (if, switch)
		//반복문 (for, while, do-while)
		System.out.println("컴퓨터가 인사를 시작합니다.");
		
		// for (초기화식, 조건식, 반복식)
		// 조건문이 참일 경우 for 문 진행
		for (int i=1; i<=5; i++) {
			System.out.println("안녕하세요-" + i);
		}
		
		System.out.println("끝.");	

	}

}

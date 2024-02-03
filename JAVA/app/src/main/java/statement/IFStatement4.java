package statement;

import java.util.Scanner;

public class IFStatement4 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요. >>");
		Scanner sc = new Scanner(System.in);
		int score =sc.nextInt();
		if(score >= 80) {
			//조건식이 참일 경우
			System.out.println("합격입니다.");
		}
		else {
			//조건식이 거짓일 경우
			System.out.println("불합격입니다.");
		}
		System.out.println("수고하셨습니다.");
	}

}

package statement;

import java.util.Scanner;

public class IFStatement01 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요. >>");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if(score >= 80) {
			//조건식이 참일때 수용할 명령문 나열
			System.out.println("합격을 축하드립니다.");
			System.out.println("28일까지 서류를 제출해주세요.");
		}
		System.out.println("수고하셨습니다.");
	}

}

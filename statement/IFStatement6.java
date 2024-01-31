package statement;

import java.util.Scanner;

public class IFStatement6 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요. >>");
		Scanner sc = new Scanner(System.in);
		int score=sc.nextInt();
		if(score <= 100 && score >= 0) {
			if(score >= 90) {
				System.out.println("A학점 입니다.");
			} else if(score >= 80) {
				System.out.println("B학점 입니다.");
			} else if(score >= 70) {
				System.out.println("C학점 입니다.");
			} else if(score >= 60) {
				System.out.println("D학점 입니다.");
			} else {
				System.out.println("F학점 입니다.");
			}		} else {
			System.out.println("점수입력 오류입니다.");
			
		}
	}

}

package statement;

import java.util.Scanner;

public class IFStatement5 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요. >>");
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
		if (number % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
	}

}

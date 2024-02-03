package statement;

import java.util.Scanner;

public class ForStatement03 {

	public static void main(String[] args) {
		System.out.println("원하는 단을 입력하세요. >>");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("***"+num+"단***");
		
		for(int i=1; i <= 9; i++) {
			System.out.println(num + " X " + i + " = " + (i*num));
		}

	}

}

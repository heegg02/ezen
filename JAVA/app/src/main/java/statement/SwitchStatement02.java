package statement;

import java.util.Scanner;

public class SwitchStatement02 {

	public static void main(String[] args) {
		char grade = 'a';
		switch (grade) {
			case 'A':
			case 'a':
				System.out.println("우수회원입니다.");
				break;
			case 'B':
			case 'b':
				System.out.println("일반회원입니다.");
				break;
			default :
				System.out.println("손님입니다.");
		}

	}

}
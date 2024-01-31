package statement;

import java.util.Scanner;

public class SwitchStatement01 {

	public static void main(String[] args) {
		// if(else if, else)
		// switch(case, break, default)
		
		System.out.println("여행지를 선택해주세요.(1. 미주 2. 유럽 3. 동남아) >>");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) {
			case 1:
				System.out.println("1층 안내데스크로 가세요.");
				break;
			case 2:
				System.out.println("2층 안내데스크로 가세요.");
				break;
			case 3:
				System.out.println("3층 안내데스크로 가세요.");
				break;
			default:
				System.out.println("여행지 선택이 잘못되었습니다.");
		}
		
		// if문의 경우
		if (choice == 1) {
			System.out.println("1층 안내데스크로 가세요.");
		} else if (choice == 2) {
			System.out.println("2층 안내데스크로 가세요.");
		} else if (choice == 3) {
			System.out.println("3층 안내데스크로 가세요.");
		} else {
			System.out.println("여행지 선택이 잘못되었습니다.");
			
		}

	}

}
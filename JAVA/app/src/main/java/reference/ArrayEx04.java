package reference;

import java.util.Scanner;

public class ArrayEx04 {

	public static void main(String[] args) {
		System.out.println("컴퓨터와 가위바위보 게임");
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 바위 2. 가위 3. 보 >>");
		int my = sc.nextInt();
		String[] choice = {"바위", "가위", "보"};
		int com = (int)(Math.random()*3+1);
		
		if(com==my) {
			System.out.println("컴퓨터와 비겼습니다.");
		} else if((com==1 && my==3) || (com==2 && my==1) || (com==3 && my==2)) {
			System.out.println("축하합니다. 승리");
		} else {
			System.out.println("아쉽네요. 패배");
		}
		System.out.println("컴퓨터 : "+ choice[com-1]+ ", 나 : " + choice[my-1]);
		
	}

}
 
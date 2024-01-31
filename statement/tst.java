package statement;

import java.util.Scanner;

public class tst {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int num = in.nextInt();
		
		if(num < 0) {
			num *= -1;
		}
		
		System.out.println(num);
	}

}

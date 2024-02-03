package statement;

import java.util.Scanner;

public class ForStatement05 {

	public static void main(String[] args) {
		int oddsum=0, evensum=0;
		for(int i=1; i<=100; i++) {
			if(i % 2 == 0) {
				evensum += i;
			} else {
				oddsum += i;
			}
		
		}//for end
		System.out.println("짝수의 합=" + evensum);
		System.out.println("홀수의 합=" + oddsum);

	}

}

package reference;

import java.util.Scanner;

public class ArrayEx06 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		boolean run = true;
		while (run) {
			// 번호 6개를 무작위로 생성
			for (int i=0; i<lotto.length; i++) {
				lotto[i] = (int)(Math.random()*45)+1;
			}	
			run = false;
			
			// 중복값 검증 알고리즘
			for (int i=0; i<lotto.length-1; i++) {
				for (int j=i+1; j<lotto.length; j++) {
						if(lotto[i] == lotto[j]) {
							run = true;
							break;
							
						}
					
				} // for end(j)
			} // for end(i)
			
		} // while end
	
		System.out.println("로또 자동번호 출력");
		for(int i=0; i<lotto.length; i++) {
			System.out.println((i+1) + "번째 번호 : " + lotto[i]);
			
		}
		
	}

}
 
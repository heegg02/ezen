package confirm;

public class ConfirmEx04 {

	public static void main(String[] args) {
//		// for(조건문) 조건문이 만족하는 경우 명령 수행후 반복
//		for(int i=10; i>=7; i--) {
//			System.out.println("안녕");
//		}
		int sum = 0;
		int dice;
		
		for(int i=1; i<=6; i++) {
			dice = (int)(Math.random()*6)+1;
			System.out.println(dice);
			sum += dice;
		}
		System.out.println("총합 = " + sum);
	}

}

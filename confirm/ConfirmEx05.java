package confirm;

public class ConfirmEx05 {

	public static void main(String[] args) {
		int sum = 0;
		int dice;
		int i = 0;
		
//		while(sum<=30) { 
//			i++;
//			dice = (int)(Math.random()*6)+1;
//			sum += dice;
//			System.out.println(i+". 주사위 수 " + dice + ", 합 = " + sum);
//		}
		
		while(true) {
			i++;
			dice = (int)(Math.random()*6)+1;
			System.out.println("주사위 수 : " + dice);
			sum += dice;
			if(sum>30) {
				break;
			}
		}
		
		System.out.println("굴린 횟수 : " + i);
		System.out.println("주사위 합 : " + sum);
		
	}

}

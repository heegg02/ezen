package statement;

public class DoWhileStatement01 {

	public static void main(String[] args) {
		// 한번 이상은 실행하기 위해 사용, 우선 실행한 후 조건식이 만족하면 반복
		
		// do {
		// 	수행할 내용
		// } while(조건식);
		
		int i=1;
		int sum=0;
		do {
			sum+=i;
			i++;
		} while(i<=100);
		System.out.println("1부터 100까지의 합 = "+sum);
		
	}
}

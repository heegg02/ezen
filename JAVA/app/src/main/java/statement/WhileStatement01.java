package statement;

public class WhileStatement01 {

	public static void main(String[] args) {
		//while(조건) 조건이 만족하면 반복
		int i=1;
		int sum=0;
		while(i<=100) {
			sum+=i;
			i++;
		}
		System.out.println("1부터 100까지의 합 = "+ sum);
	}
}

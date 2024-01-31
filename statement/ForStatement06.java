package statement;

public class ForStatement06 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=100; i++) {
			
			sum+=i;
			if(sum > 3500) {
				System.out.println(i);
				System.out.println(sum);
				break;
			}
		}
	}
}

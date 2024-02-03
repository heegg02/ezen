package statement;

public class ForStatement12 {

	public static void main(String[] args) {
		exit:for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i==3) {
					break exit;
				}
				System.out.println(i+"---"+j);
			}
		}
		
	}
}

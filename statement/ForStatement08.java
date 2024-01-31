package statement;

public class ForStatement08 {

	public static void main(String[] args) {
		for(int dan=2; dan<=9; dan++) {
			System.out.println("**" + dan + "단**");
			for(int num=1; num<=9; num++) {
				System.out.println(num + " X " + dan + " = " + dan*num);
			}
		}
	}
}

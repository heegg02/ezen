package operator;

public class OperatorEX08 {

	public static void main(String[] args) {
		//논리 연산자 ( &&(AND) ||(OR) !(NOT) ) 
		int num1 = 25;
		int num2 = 30;
		System.out.println(num1>=10 && num2>=10);
		char ch1 ='a';
		if(ch1>=65 && ch1<=90) {
			System.out.println("대문자이군요");
		}
		if(ch1>=97 && ch1<=122) {
			System.out.println("소문자이군요");
		}

	}

}

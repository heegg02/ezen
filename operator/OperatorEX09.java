package operator;

public class OperatorEX09 {

	public static void main(String[] args) {
		//비트 논리 연산자
		System.out.println(45 & 25);
		System.out.println(45 | 25); //
		System.out.println(45 ^ 25); //배타적 논리 비트 값이 서로 다를 경우 참
		//비트 이동 연산자
		int num1=13;
		System.out.println(num1 << 2);
		int num2=50;
		System.out.println(num2 >> 1);
		
	}

}

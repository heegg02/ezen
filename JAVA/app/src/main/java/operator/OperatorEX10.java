package operator;

public class OperatorEX10 {

	public static void main(String[] args) {
		//삼항연산자
		int num1=70;
		int num2=30;
		int result = (num1>num2)?num1:num2; //(조건식)?값 또는 수식:값 또는 수식;
		System.out.println("두 수 중에 큰 값은 " + result + "입니다.");
	}

}

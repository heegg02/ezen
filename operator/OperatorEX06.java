package operator;

public class OperatorEX06 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		int result;
		try {
			result = num1 / num2;
			System.out.println("결과 = " + result);
		}catch (Exception e) {
			System.out.println("0으로 나누면 안됩니다.");
		}
	}

}

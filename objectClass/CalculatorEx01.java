package objectClass;

public class CalculatorEx01 {

	public static void main(String[] args) {
		
		Calculator myCal = new Calculator();
		
		int result = myCal.sum(145, 325);
		System.out.println("계산결과 = " + result);
		
		int result2 = myCal.sum(123, 222, 534);
		System.out.println("계산결과 = " + result2);
		
		int result3 = myCal.sum(1, 23, 232, 231, 5, 5, 5);
		System.out.println("계산결과 = " + result3);
		
		int[] values = {2, 45, 96, 10, 35};
		int result4 = myCal.sum(values);
		System.out.println("계산결과 = " + result4);
		

	}

}

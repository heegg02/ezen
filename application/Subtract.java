package application;

// 구현 클래스
public class Subtract implements Calculable{

	@Override
	public void calculate(int x, int y) {
		System.out.println("두 수의 차 = " + (x-y));
		
	}
	
}

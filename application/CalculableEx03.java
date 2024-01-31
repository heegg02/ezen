package application;

public class CalculableEx03 {

	public static void main(String[] args) {
		Calculable calcu; // 선언
		// 람다식
		calcu = (x,y) ->  {
			System.out.println("두 수의 합 = " + (x+y));
			
		};
		
		calcu.calculate(20, 45);
		calcu = new Calculable() {
					
			@Override
			public void calculate(int x, int y) {
				System.out.println("두 수의 차 = " + (x-y));
			}
		};
		calcu.calculate(20, 45);
	}

}

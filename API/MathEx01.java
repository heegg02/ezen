package API;

public class MathEx01 {

	public static void main(String[] args) {
		double num1 = Math.round(5.7); // round 반올림
		System.out.println(num1);
		
		double num2 = Math.ceil(8.3); // ceil 올림
		System.out.println(num2);
		double num3 = Math.ceil(-8.3);
		System.out.println(num3);
		
		double num4 = Math.floor(8.3); // floor 내림
		System.out.println(num4);
		double num5 = Math.floor(-8.3);
		System.out.println(num5);
		
		int num6 = Math.max(12, 74); // max 큰 값
		System.out.println(num6);
		int num7 = Math.min(12, 74); // min 작은 값
		System.out.println(num7);

		
	}

}

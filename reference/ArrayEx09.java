package reference;

public class ArrayEx09 {

	public static void main(String[] args) {
		int[] num1 = {10, 20, 30};
		int[] num2 = new int[3];
		
		// num1 -> num2 로 배열 복사
		for(int i=0; i<num1.length; i++) {
			num2[i] = num1[i];
		}
		
		for(int i=0; i<num2.length; i++) {
			System.out.println(num2[i]);
		}
	}

}
 
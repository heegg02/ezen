package reference;

public class ArrayEx02 {

	public static void main(String[] args) {
		int[] nums = {45, 90, 23, 42, 77}; //배열 선언과 초기화
		int sum = 0;
		for (int i=0; i<nums.length; i++) {
			sum += nums[i];
		}
		System.out.println(sum);
		
		
	}

}

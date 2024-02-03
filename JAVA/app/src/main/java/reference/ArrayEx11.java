package reference;

public class ArrayEx11 {

	public static void main(String[] args) {
		int[] nums = {85, 120, 15, 96, 8, 23, 63, 12};
		int sum = 0;
		
		/*for (int i = 0; i<nums.length; i++) {
			sum += nums[i];
		}*/
		
		// 향상된 for
		for(int value : nums) {
			sum += value;
		}
		
		System.out.println(sum);
		
	}

}
 
package reference;

public class ArrayEx03 {

	public static void main(String[] args) {
		int[] nums = {45,90,23,42,77,96,32,43,12,15};
		int sum = 0;
		for(int i=0; i<nums.length; i++) {
			if (nums[i] % 2 == 0) {
				sum += nums[i];
			}
			
		}
		System.out.println("짝수들의 총합= " + sum);
		
	}

}

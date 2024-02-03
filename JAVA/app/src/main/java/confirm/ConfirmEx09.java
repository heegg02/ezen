package confirm;

public class ConfirmEx09 {

	public static void main(String[] args) {
		int[] nums = { 45, 96, 3, 251, 90, 75, 356, 7, 102, 10 };
		int max = 0;

		for (int i = 0; i < nums.length; i++) {
			if (max < nums[i]) {
				max = nums[i];
			}
		}
		System.out.println("가장 큰 값은 : " + max);
	}

}

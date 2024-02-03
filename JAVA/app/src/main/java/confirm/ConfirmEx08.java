package confirm;

public class ConfirmEx08 {

	public static void main(String[] args) {
		// 필드 : 값을 저장하는 장소
		// 생성자 : 값을 초기화를 담당
		// 매소드 :

		// int[] nums : 배열 객체 선언, new int[5] : 배열 공간 확보
		int[] nums = new int[5];
		nums[0] = 25;
		nums[2] = 70;
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

		int[] nums2 = { 20, 89, 451, 36, 70 };
		int sum2 = 0;
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums2[i]);
			sum2 += nums2[i];
		}
		System.out.println("총합 = " + sum2);

	}

}

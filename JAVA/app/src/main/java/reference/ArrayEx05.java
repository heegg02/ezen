package reference;

import java.util.Scanner;

public class ArrayEx05 {

	public static void main(String[] args) {
		// 정렬(SORT) : 자료를 원하는 순서로 정렬, 재배열
		// 오름차순(ACENDING SORT) : 작운 -> 큰, 내림차순(DECENING SORT) : 큰 -> 작은

		int[] nums = {50, 23, 4, 82, 66};
		int temp; // 임시 기억 장소
		
		// SORT 전 자료 출력
		System.out.println("SORT 전 자료 출력");
		for (int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + "  ");
		}
		// SORT 알고리즘 구현
		for (int i=0; i<nums.length-1; i++) {
			for (int j=i+1; j<nums.length; j++) {
				if (nums[i] > nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			} // for end(j)
		} // for end(i)
		
		// SORT 후 자료 출력
		System.out.println("\nSORT 후 자료 출력");
		for (int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + "  ");
		}
		
	}

}
 
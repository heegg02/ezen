package application;

import java.util.ArrayList;
import java.util.List;

public class GenericEx01 {

	public static void main(String[] args) {
//		int[] nums = new int[3];
//		nums[0] = 10;
//		nums[1] = 26;
//		nums[2] = 8;
//		
//		for(int i=0; i<nums.length; i++) {
//			System.out.println("배열 [ " + i + " ] = " + nums[i]);
//		}
//		
//		// 동적 배열
//		List list = new ArrayList();
//		list.add(10);
//		list.add("홍길동");
//		list.add(8.22);
//		list.add(true);
//		int num = (int)list.get(0);
//		String name = (String)list.get(1);
//		for(int i=0; i<list.size(); i++) {
//			System.out.println("리스트 [ " + i + " ] = " + list.get(i));
//		}
		
		List<String> list = new ArrayList<String>(); // 동적배열
		list.add("홍길동");
		list.add("김길동");
		list.add("이길동");
		list.add("박길동");
		list.add("손길동");		// add 추가
		list.set(2, "이영희");	// set 변경
		list.remove(3);			// remove 삭제
		
		String name = list.get(2);
		System.out.println(name);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println("리스트 [ " + i + " ] = " + list.get(i));
		}
		
		
	}

}
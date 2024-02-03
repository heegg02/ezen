package API;

public class StringEx01 {
	
	public static void main(String[] args) {
//		// 기존의 매모리에서 값을 불러오며 값을 더한후 기존의 매모리에 값을 저장
//		int num = 10;
//		num += 20;
//		System.out.println(num);
//		
//		// 기존의 매모리는 방치하고 새로운 매모리에 할당하여 저장
//		String str = "kk";
//		str += "uu";
//		str += "aa";
//		
//		System.out.println(str);
		
		// StringBuilder 의 append 는 매모리 번지를 찾아 메모리 끝을 확장하여 저장
		StringBuilder sb = new StringBuilder();
		sb.append("우리모두");
		sb.append("파이팅");
		System.out.println(sb.toString());

		// StringBuilder 의 insert(4, "힘차게") 는 매모리 번지를 찾아 4번째에서 "힘차게" 를 확장하여 저장
		sb.insert(4, "힘차게");
		System.out.println(sb.toString());
		
		// StringBuilder 의 setCharAt(7, '호') 은 매모리 번지를 찾고 7번째 값을 '호' 로 변경 
		sb.setCharAt(7, '호');
		System.out.println(sb.toString());
		
		// replace
		sb.replace(4, 7, "아자아자");
		System.out.println(sb.toString());
		
		// 
		sb.delete(8, 11);
		System.out.println(sb.toString());
		
		String result = sb.toString();
		System.out.println(result);
		
		
	}
	
}

package reference;

public class StringEx06 {

	public static void main(String[] args) {
		String str = "프로그램 언어 자바을 매일 8시간씩 배우고 있다.";
		int location = str.indexOf("파이썬");
		System.out.println(location);
		
		String str2 = "자바의 정석은 자바의 기초부터 활용까지 자바를 정복할 수 있다.";
		int location2 = str2.lastIndexOf("자바");
		System.out.println(location2);
		
	}
}
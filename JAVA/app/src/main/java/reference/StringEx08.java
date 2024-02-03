package reference;

public class StringEx08 {

	public static void main(String[] args) {
		String str = "김철수,이영희,홍길동,박찬호,손흥민";
		
		// split(구분자) 는 구분자를 통해 문자를 구분하여 배열에 포함
		String[] names = str.split(",");
		System.out.println("합격자 명단");
		for(int i = 0; i < names.length; i++) {
			System.out.println((i+1) + "번 : " + names[i]);
		}
		
	}
}
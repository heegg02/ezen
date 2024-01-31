package reference;

public class StringEx07 {

	public static void main(String[] args) {
		String book = "자바의 정석";
		
		// indexOf 는 동일한 값의 문자열을 찾아주며, 동일한 값이 없으면 -1
		int location = book.indexOf("자바");
		
		if(location != -1) {
			System.out.println("자바와 관련이 책입니다.");
		} else {
			System.out.println("자바와 관련된 책이 아닙니다.");
		}
		
		// contains 는 값이 있으면 true, 없으면 false
		boolean result = book.contains("자바");
		
		if(result) {
			System.out.println("자바와 관련이 책입니다.");
		} else {
			System.out.println("자바와 관련된 책이 아닙니다.");
		}
	}
}
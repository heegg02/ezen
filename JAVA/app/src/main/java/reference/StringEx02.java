package reference;

public class StringEx02 {

	public static void main(String[] args) {
		
		// string은 참조열, 값의 주소가 저장
		String str1 = "홍길동";
		String str2 = "홍길동";
		if (str1 == str2) {
			System.out.println("str1과 str2는 같은 참조입니다.");
		} else {
			System.out.println("str1과 str2는 다른 참조입니다.");
		}
		
		// equals는 "값"을 가지고와 비교
		if(str1.equals(str2)) {
			System.out.println("str1과 str2는 같은 문자열입니다.");
		
		} else {
			System.out.println("str1과 str2는 다른 문자열입니다.");
		}
		
		// new는 새로운 객체를 생성
		String str3 = new String("김철수");
		String str4 = new String("김철수");
		if (str3 == str4) {
			System.out.println("str3과 str4는 같은 참조입니다.");
		} else {
			System.out.println("str3과 str4는 다른 참조입니다.");
		}
		if(str3.equals(str4)) {
			System.out.println("str3과 str4는 같은 문자열입니다.");
		
		} else {
			System.out.println("str3과 str4는 다른 문자열입니다.");
		}
	}

}

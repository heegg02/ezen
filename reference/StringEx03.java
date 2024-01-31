package reference;

public class StringEx03 {

	public static void main(String[] args) {
		// charAt() : 메소드의 하나, 문자열 ()자리의 값을 추출
		
		/*String title = new String("우리 모두 파이팅");
		char ch = title.charAt(3);
		System.out.println(ch);*/
		String ssn = "123456-1234567";
		char sex = ssn.charAt(7);
		if(sex == '1' || sex == '3') {
			System.out.println("남성 입니다.");
		} else if(sex == '2' || sex == '4') {
			System.out.println("여성 입니다.");
		} else {
			System.out.println("잘못된 주민번호입니다.");
		}
		
	}

}

package reference;

public class StringEx04 {

	public static void main(String[] args) {
		String ssn = "9710122123456";
		System.out.println("총 글자수 = " + ssn.length());
		int len = ssn.length();
		if(len == 13) {
			System.out.println("정상적인 주민번호입니다.");
		} else {
			System.out.println("비정상적인 주민번호입니다.");
		}
		
	}
}
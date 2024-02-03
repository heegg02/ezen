package reference;

public class StringEx05 {

	public static void main(String[] args) {
		String str = "우리나라 파이팅";
		String newStr = str.replace("우리나라", "대한민국");
		System.out.println(str);
		System.out.println(newStr);
		
		String str2 = "computer";
		
		// substring() : 
		System.out.println(str2.substring(5));
		System.out.println(str2.substring(3, 6));
		
		String ssn = "950505-2333333";
		System.out.println("주민번호 : " + ssn.substring(0, 7) + "*******");
		
	}
}
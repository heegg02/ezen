package API;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("전화번호 입역 >> ");
		String phoneNumber = sc.next();
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		boolean result = Pattern.matches(regExp, phoneNumber);
		
		if(result) {
			System.out.println("전화번호 : " + phoneNumber);
		}else {
			System.out.println("전화번호 형식이 잘못되었습니다.");
		}
		
		System.out.print("이메일 입력 >> ");
		String email = sc.next();
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		result = Pattern.matches(regExp, email);
		
		if(result) {
			System.out.println("이메일 : " + email);
		}else {
			System.out.println("이메일 형식이 잘못되었습니다.");
		}
	
	}

}

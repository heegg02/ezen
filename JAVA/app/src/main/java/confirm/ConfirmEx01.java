package confirm;

public class ConfirmEx01 {

	public static void main(String[] args) {
		
		// 기본형(primitive type) 크기의 한계가 있는 변수 : boolean(논리형), char(문자형), 정수형(byte, short, int, long), 실수형(float, double)
		// 참조형(reference) 주소가 저장되어있는 변수 : 배열, 클래스, 열거형(enum), 인터페이스
		
		// byte < short < int < long < Float < double
		
		int num; // 변수의 선언
		num = 20; // 변수의 값 지정
		
		// 타입 변수명  =  값 ;
		boolean bool = true;
		char ch = 'A'; // char 는 한 문자를 기억하는 변수
		
		
		if(bool) {
			System.out.println("안녕하세요");
		} else {
			System.out.println("잘가세요");
		}
		
	}

}

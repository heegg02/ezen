package confirm;

public class ConfirmEx02 {

	public static void main(String[] args) {
		int num;
		double dnum = 2.5;
		num = (int)dnum; // 형변환
		
		int num2 = 20;
		double dnum2;
		dnum2 = num2; // 자동 형변환
		
		int num3 = 5/2;
		System.out.println(num3);
		
		// 5/2 정수/정수=정수
		double num4 = 5.0/2.0; 
		System.out.println(num4);
		
		int num5 = 5;
		int num6 = 2;
		double result = (double)num5/num6;
		System.out.println(result);
		
//		int num7;
//		num7 += 20;  // 이항연산자 은 양옆에 항이 있어야 
//		System.out.println(num7);
		
		int kor = 85;
		int eng = 96;
		
		// if(조건문) 조건문이 참일경우 명령 실행, 조건문이 거짓일 경우 else 명령문 실행
		if(kor>=80 && eng>=80) {
			System.out.println("경시대회 참여 가능");
		} else {
			System.out.println("경시대회 참여 불가");
		}
		 
		
		
	}

}

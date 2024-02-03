package exception;

public class ExceptionEx02 {

	public static void main(String[] args) {
		String[] str = {"100", "200","150"};
		int sum = 0;
		
		try {
			for(int i = 0; i < str.length; i++) {
				int value = Integer.parseInt(str[i]);
				sum += value;
			}
			System.out.println("종합 : " + sum);
		} catch(ArrayIndexOutOfBoundsException e){ 					// catch 는 try 안에서 예외, 에러 발생한 경우 실행
			System.out.println("배열 인덱스가 초과했습니다.");
		} catch(NumberFormatException e) {
			System.out.println("문자 데이터는 변환할 수 없습니다.");
		} catch(Exception e) {
			System.out.println("예외 발생했습니다." + e.getMessage());
		} finally { 												// finally는 try 안에서 catch가 발생한 경우에도 실행
			System.out.println("무조건 실행");
		}
		
		
		
	}
}

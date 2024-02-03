package confirm;

public class ConfirmEx03 {

	public static void main(String[] args) {
		// 점수가 100 ~ 80(우수합니다.), 79 ~ 60(준수합니다.), 59이하(노력합시다.) 
		int score = 75;

		if(score<=100 && score>=80) {
			System.out.println("우수합니다.");
		} else if(score<=79 && score>=60) {
			System.out.println("준수합니다.");
		} else {
			System.out.println("노력합시다.");
		}
		
	}

}

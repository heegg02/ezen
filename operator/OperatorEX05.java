package operator;

public class OperatorEX05 {

	public static void main(String[] args) {
		int pencils=534;
		int student=30;
		//학생 한 명이 가지는 연필 수
		System.out.println("학생 한 명이 가지는 연필 수=" + pencils/student);
		//나눠주고 남은 연필 수
		System.out.println("나눠주고 남은 연필 수=" + pencils%student);
	}

}

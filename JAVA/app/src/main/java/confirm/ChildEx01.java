package confirm;

public class ChildEx01 {

	public static void main(String[] args) {
		Child chulsu = new Child("김철수", 1523);
		chulsu.eat("칼국수");
		System.out.println(chulsu.name + "의 학번은 " + chulsu.studentNo + "입니다.");
		Child gildong = new Child("홍길동", 1544);
		chulsu.eat("만두");
		System.out.println(gildong.name + "의 학번은 " + gildong.studentNo + "입니다.");
		
	}

}

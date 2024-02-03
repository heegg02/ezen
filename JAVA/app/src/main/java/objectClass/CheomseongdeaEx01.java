package objectClass;

public class CheomseongdeaEx01 {

	public static void main(String[] args) {
		Cheomseongdea chulsu = Cheomseongdea.getCheomseongdea();
		Cheomseongdea gildong = Cheomseongdea.getCheomseongdea();
		chulsu.show("철수");
		gildong.show("길동");
		if(chulsu == gildong) {
			System.out.println("같은 객체(첨성대) 입니다.");
		} else {
			System.out.println("다른 객체(첨성대) 입니다.");
		}

	}

}

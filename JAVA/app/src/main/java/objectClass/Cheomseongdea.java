package objectClass;

public class Cheomseongdea {
	private static Cheomseongdea cheom = new Cheomseongdea();
	
	private Cheomseongdea() {
		
	}

	// 싱글톤 정보 가져오는 메서드
	public static Cheomseongdea getCheomseongdea() {
		return Cheomseongdea.cheom;
		
	}
	
	// 천문관측 메서드
	public static void show(String name) {
		System.out.println(name + "(가)이 천문을 관측합니다.");
	}
	
	
}

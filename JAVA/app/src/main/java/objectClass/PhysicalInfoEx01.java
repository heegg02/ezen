package objectClass;

public class PhysicalInfoEx01 {

	public static void main(String[] args) {
		PhysicalInfo hee;
		hee = new PhysicalInfo("이환희", 22, 173.3f, 60.5f);
		printPhysicalInfo(hee);
		hee.update(23, 180.3f, 72.5f);
		printPhysicalInfo(hee);
		hee.update(24, 183.3f);
		printPhysicalInfo(hee);
		hee.update(25);
		printPhysicalInfo(hee);
		
	}
	
	// 신체정보를 출력하는 메서드
	public static void printPhysicalInfo(PhysicalInfo obj) {
		System.out.println("이름 : " + obj.name);
		System.out.println("나이 : " + obj.age);
		System.out.println("키 : " + obj.height);
		System.out.println("몸무게 : " + obj.weight);
		System.out.println();
		
	}

}

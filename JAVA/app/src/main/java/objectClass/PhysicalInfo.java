package objectClass;

// 자녀의 신체정보를 매년 저장
public class PhysicalInfo {
	// 맴버변수(필드)
	String name;
	int age;
	// float 는 8byte 실수
	float height, weight;
	
	// 생성자 맴버 변수의 초기화를 담당
	public PhysicalInfo(String name, int age, float height, float weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// 메서드 매년마다 성장 데이터를 기록
	void update(int age, float height, float weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// 메소드 오버로딩 은 같은 이름의 메소드를 여러개 만들 수 있다.
	// 단, 매개 변수에 변화가 있어야 한다. ex)매게변수개 수 변화, 매개 변수 타입 변화
	void update(int age, float height) {
		this.age = age;
		this.height = height;
	}
	
	void update(int age) {
		this.age = age;
	}
}

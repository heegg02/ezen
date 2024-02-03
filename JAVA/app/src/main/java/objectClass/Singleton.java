package objectClass;

public class Singleton {
	// 정적 필드 선언과 초기화
	private static Singleton sington = new Singleton();

	// 생성자
	private Singleton() {

	}

	// 메서드
	static Singleton getInstance() {
		return sington;
	}

}

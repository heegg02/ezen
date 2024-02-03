package objectClass;

public class ClassA {
	// 필드
	int memberA1;
	
	// 생성자
	public ClassA() {
		System.out.println("ClassA의 생성자가 수행됨");
	}
	
	class ClassB {
		// 필드
		int memberB1 = 20;
		
		// 생성자
		public ClassB() {
			System.out.println("ClassB의 생성자가 수행됨");
		}
		
		// 매서드
		void methodB1() {
			System.out.println("ClassB의 매서드가 수행됨");
		}
	}
	
	// 매서드
	void methodA1() {
		System.out.println("ClassA의 매서드가 수행됨");
	}
	
}
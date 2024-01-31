package objectClass;

public class ClassAEx01 {

	public static void main(String[] args) {
		// ClassA의 인스턴스 객체 생성
		ClassA a = new ClassA();
		a.memberA1 = 50;
		a.methodA1();
		ClassA.ClassB b = a.new ClassB();
		

	}

}

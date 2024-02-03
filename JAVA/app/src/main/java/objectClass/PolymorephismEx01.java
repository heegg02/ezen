package objectClass;

// 다형성 예제
public class PolymorephismEx01 {

	public static void main(String[] args) {
		
		Car myCar = new Car(); // myCar 인스턴트 객체 생성
		myCar.tire = new Tire(); // 타이어 객채를 생성 myCar 객체 창착
		myCar.run(); // 매서드 수행
		myCar.tire = new HankookTire(); // 한국타이어 객채를 생성 myCar 객채 장착
		myCar.run();
		myCar.tire = new KumhoTire(); // 금호타이어 객채를 생성 myCar 객채 장착
		myCar.run();
		
	}

}

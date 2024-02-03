package objectClass;

// 은행계좌(통장) 클래스
public class DokdoAccount extends Account {
	
	// 필드(맴버 변수)
	int point; // 독도 기부 포인트
	
	// 생성자
	public DokdoAccount(String accountNO, String ownerName, int balance, int point) {
		super(accountNO, ownerName, balance);
		this.point = point;
		
	}
	
	// 매서트 재정의
	@Override // 오버라이드 부모 매서드를 확장, 변경할 경우 사용
	void deposit(int amount) {
		super.deposit(amount);
		point += amount * 0.001;
	}
}

package objectClass;

// 체크카드 클래스 

// class 자식객체 extends 부모객체
// extends 상속
public class CheckingAccount extends Account {
	// 필드 (맴버 변수)
	String cardNo; // 카드 번호
	
	// 생성자
	public CheckingAccount(String accountNum, String ownerName, int balance, String cardNo) {
		super(accountNum, ownerName, balance);
		this.cardNo = cardNo;
	}
	
	public CheckingAccount() {
		
	}
	// 메서드(카드로 지불한다)
	int pay(String cardNo, int amount) throws Exception {
		if(!cardNo.equals(this.cardNo) || balance < amount) {
			throw new Exception("지불이 불가능 합니다.");
		}
		return withdraw(amount);
	}
	
}

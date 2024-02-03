package objectClass;


// 은행 계좌 Class
public class Account {
	// 맨버 변수 (필드, 속성)
	static final String BANKNAME="신한은행"; // 은행
	String accountNo; // 계좌 번호
	String ownerName; // 예금주 이름
	int balance; // 잔액
	
	// 생성자
	/*public Account(String acc, String own, int bal) {
		accountNo = acc;
		ownerName = own;
		balance = bal;
	}*/
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	public Account() {
	
	}

	// 예금 메서드
	void deposit(int amount) {
		balance += amount;
	}
	
	// 인출 메서드
	int withdraw(int amount) throws Exception {
		
		if(balance < amount) {
			throw new Exception("잔액이 부족합니다.");
		}
		balance -= amount;
		return amount;
	}
}

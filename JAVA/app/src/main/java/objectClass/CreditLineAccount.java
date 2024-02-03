package objectClass;

// 오버라이딩(재정의) 매소드를 필요에 따라 재정의
// 마이너스 통장 클래스 
public class CreditLineAccount extends Account {
	int creditLine; // 마이너스 한도
	
	public CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}
	
	// 인출 매서드(재정의)
	@Override
	int withdraw(int amount) throws Exception {
		
		if(creditLine + balance < amount) {
			throw new Exception("인출이 불가능합니다.");
		}
		balance -= amount;
		return amount;
	}
	public CreditLineAccount() {
		// TODO Auto-generated constructor stub
	}
	
	
}
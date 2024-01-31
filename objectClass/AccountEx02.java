package objectClass;

public class AccountEx02 {

	public static void main(String[] args) {
// 객채        선언           생성                 초기화
		Account chanho = new Account("222-33-55555", "박찬호", 0);
		Account younghee = new Account("555-33-88888", "이영희", 2000);
		chanho.deposit(5000);
		try {
			chanho.withdraw(1000);
			printAccount(younghee);
			printAccount(chanho);
			printAccount(new Account("333-77-55555", "손흥민", 100000));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		
	}// main end
	
	//통장 잔고 출력 메서드
	static void printAccount(Account obj) {
		System.out.println("계좌 번호 : " + obj.accountNo);
		System.out.println("예금주 이름 : " + obj.ownerName);
		System.out.println("계좌 잔액 : " + obj.balance);
		System.out.println("====================");
	}
}

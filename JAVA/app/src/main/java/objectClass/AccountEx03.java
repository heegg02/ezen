package objectClass;

public class AccountEx03 {

	public static void main(String[] args) {
		Account hwanhee = new Account("123-12-12345", "이환희", 0);
		hwanhee.deposit(20000);
		try {
			int amount = hwanhee.withdraw(7000);
			System.out.println("인출액 : " + amount);
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		Account chulsu = new Account("111-11-11111", "이철수", 100);
		chulsu.deposit(3000);
		System.out.println("거래 은행 : " + Account.BANKNAME);
		System.out.println("계좌 번호 : " + chulsu.accountNo);
		System.out.println("예금주 이름 : " + chulsu.ownerName);
		System.out.println("계좌 잔액 : " + chulsu.balance);
	
	}
}

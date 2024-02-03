package exception;

public class AccountEx01 {

	public static void main(String[] args) {
		Account chulsu = new Account("111-11-12121", "김철수", 100);
		chulsu.deposit(5000);
		try {
			int amount = chulsu.withdraw(30000);
			System.out.println("인출 금액 : " + amount);
			System.out.println("잔액 : " + chulsu.balance);
		} catch (InsufficientException e) {
			System.out.println(e.getMessage());
		}

	}

}

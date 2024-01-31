package objectClass;

public class CheckingAccountEx01 {
	
	public static void main(String[] args) {
		CheckingAccount hee = new CheckingAccount("222-11-22222", "이환희", 100, "1111-1111-1111-1111");
		hee.deposit(5000);
		try {
			int paidAmount = hee.pay("1111-1111-1111-1111", 1500);
			System.out.println("지불액 : " + paidAmount);
			System.out.println("잔액은 : " + hee.balance);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		
	}

}
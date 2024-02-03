package objectClass;

public class DokdoAccountEx01 {

	public static void main(String[] args) {
		DokdoAccount chulsu = new DokdoAccount("555-22-11111", "김철수", 0, 0);
		chulsu.deposit(50000);
		System.out.println("잔액 : " + chulsu.balance);
		System.out.println("기부 포인트 : " + chulsu.point);
		chulsu.deposit(50000);
		System.out.println("잔액 : " + chulsu.balance);
		System.out.println("기부 포인트 : " + chulsu.point);

	}

}

package statement;

import java.util.Scanner;

public class IFStatement02 {

	public static void main(String[] args) {
		System.out.println("구입할 수량을 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		int price = 5000;
		String memo= "(정상가)";
		if(amount >= 10) {
			price *= 0.8; //price = (int)(price * 0.8);
			memo = "(할인가)";
		}
		int salesPrice = amount * price;
		System.out.println("구입 금액=" + salesPrice + memo);
	}

}

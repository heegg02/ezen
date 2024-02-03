package statement;

import java.util.Scanner;

public class IFStatement03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("구입할 수량을 입력하세요. >>");
		int amount = sc.nextInt();
		System.out.println("단가를 입력하세요. >>");
		int price = sc.nextInt();
		if(amount >= 10 && price >= 1000) {
			price*=0.8;
		}
		int salesPrice = amount * price;
		System.out.println("구입금액=" + salesPrice);
	}

}

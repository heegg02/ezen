package operator;

import java.util.Scanner;

public class OperatorEX11 {

	public static void main(String[] args) {
		
	System.out.println("상품의 가격을 입력하시오>>");
	Scanner sc=new Scanner(System.in);
	int price=sc.nextInt();
	double discountRate = (price >= 10000) ? 0.2:0.1;
	double discountprice = price - (price * discountRate);
	//double discountprice = (price >= 10000) ? price*0.8 : price*0.9;
	System.out.println("상품의 가격은 " + price + "원이며, 할인율을 적용하여 " + (int)discountprice +"원에 구입 가능합니다.");
	System.out.printf("상품의 가격은 %d원이고 할인율을 적용하여 %d원에 구입 가능합니다.", price, (int)discountprice);
			
	}
}

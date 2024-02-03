package confirm;

public class ConfirmEx10 {

	public static void main(String[] args) {
		GoodsStock goods1 = new GoodsStock("KR1254", 20);
		GoodsStock goods2 = new GoodsStock("PS7451", 50);
		goods1.addStock(10);
		System.out.println("상품명 : " + goods1.goodsCode);
		System.out.println("재고수량 : " + goods1.stockNum);
		int amount = goods2.subtractStock(30);
		if(amount == 0) {
			System.out.println("재고 수량이 부족합니다.");
		} else {	
			System.out.println("상품명 : " + goods2.goodsCode);
			System.out.println("판매수량 : " + amount);
			System.out.println("재고수량 : " + goods2.stockNum);
		
		}
		
	}

}

package confirm;

// 상품재고 클래스
public class GoodsStock {
	// 필드 (맴버변수)
	String goodsCode; // 상품코드
	int stockNum; // 재고수량

	// 생성자 : 상품코드와 수량을 매개변수로 받아서 맴버변수에 초기화하는 생성자
	public GoodsStock(String goodsCode, int stockNum) {
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}

	// 재고를 더한다 - 매서드
	void addStock(int amount) {
		stockNum += amount;
	}
	
	// 재고를 뺀다 - 매서드
	int subtractStock(int amount) {
		if (stockNum < amount) {
			return 0;
		} 
		stockNum -= amount;
		return amount;
		
	}

}

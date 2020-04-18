package fruitsell;

public class Seller {

	int goodsNum = 10;
	int inputMoney = 0;
	final int PRICE = 1000;
	
	int sellGoods(int money) { //구매자가 지불한 돈
		
		int buyNum = money / 1000;
		goodsNum -= buyNum;
		inputMoney += money;
		return buyNum;
	}
	
	void showSeller() {
		System.out.println("판매자 수입 : " + inputMoney);
		System.out.println("판매 후 현재 상품의 수 : " + goodsNum);
	}
	
}

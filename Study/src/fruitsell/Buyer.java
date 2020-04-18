package fruitsell;

public class Buyer {

	int myMoney = 50000;
	int goodsNum = 0;
	
	void buyGoods(Seller sell,int money) {
		goodsNum += sell.sellGoods(money);
		myMoney -= money;
	}
	
	void showBuyer() {
		System.out.println("구매자 현재 금액 : " + myMoney);
		System.out.println("구매자가 산 상품의 수 : " + goodsNum);
	}
}

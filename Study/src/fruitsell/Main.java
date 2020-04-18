package fruitsell;

public class Main {

	public static void main(String[] args) {
		Seller seller = new Seller();
		Buyer buyer = new Buyer();
		
		int money = 5000; 
		buyer.buyGoods(seller,money); // 판매자 클래스의 주소값을 넘겨줌

		System.out.println("구매자가 5000원 지불");
		System.out.println();
		buyer.showBuyer();
		System.out.println("-------------");
		seller.showSeller();
	}

}

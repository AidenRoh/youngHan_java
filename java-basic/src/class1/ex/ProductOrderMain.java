package class1.ex;

public class ProductOrderMain {
	public static void main(String[] args) {
		ProductOrder[] orders = new ProductOrder[3];

		ProductOrder order1 = new ProductOrder();
		order1.menu = "두부";
		order1.price = 2000;
		order1.quantity = 2;
		orders[0] = order1;

		ProductOrder order2 = new ProductOrder();
		order2.menu = "김치";
		order2.price = 5000;
		order2.quantity = 1;
		orders[1] = order2;

		ProductOrder order3 = new ProductOrder();
		order3.menu = "콜라";
		order3.price = 1500;
		order3.quantity = 2;
		orders[2] = order3;

		int totalAmount = 0;

		for (ProductOrder order : orders) {
			System.out.println("상품명: " + order.menu + ", 가격: " + order.price + ", 수량: " + order.quantity);
			totalAmount += order.price * order.quantity;
		}

		System.out.println("총 결제 금액: " + totalAmount);
	}
}

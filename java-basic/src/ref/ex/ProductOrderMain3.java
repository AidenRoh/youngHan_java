package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("입력할 주문의 개수를 입력하세요: ");
		int orderAmount = scanner.nextInt();
		/*
			숫자 입력 후 엔터를 치게 되면 엔터가 \\n로 만들어지게 되는데, 이후 nextLine을 사용하게 되면
			빈값이 나오게 된다. 이를 해결하기 위해 아래와 같은 작업을 해준다.
		 */
		scanner.nextLine(); //입력 버퍼를 비우기 위한 코드

		ProductOrder[] orders = new ProductOrder[orderAmount];

		for (int i = 0; i < orders.length; i++) {
			System.out.println((i+1) + " 번째 주문 정보를 입력하세요.");

			System.out.println("상품명: ");
			String menu = scanner.nextLine();

			System.out.println("가격: ");
			int price = scanner.nextInt();

			System.out.println("수량: ");
			int quantity = scanner.nextInt();
			scanner.nextLine(); //입력 버퍼를 비우기 위한 코드

			orders[i] = createProductOrder(menu, price, quantity);
		}

		printProductOrder(orders);
		int totalAmount = getTotalAmount(orders);
		System.out.println("총 결제 금액: " + totalAmount);
	}

	static ProductOrder createProductOrder(String menu, int price, int quantity) {
		ProductOrder productOrder = new ProductOrder();
		productOrder.menu = menu;
		productOrder.price = price;
		productOrder.quantity = quantity;
		return productOrder;
	}

	static void printProductOrder(ProductOrder[] orders) {
		for (ProductOrder order : orders) {
			System.out.println("상품명: " + order.menu + ", 가격: " + order.price + ", 수량: " + order.quantity);
		}
	}

	static int getTotalAmount(ProductOrder[] orders) {
		int totalAmount = 0;
		for (ProductOrder order : orders) {
			 totalAmount += order.price * order.quantity;
		}
		return totalAmount;
	}
}

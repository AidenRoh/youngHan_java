package poly.ex6;

public class Bird extends AbstractAnimal implements Fly { // 상속은 하나만 가능하지만 구현은 다중구현이 가능하기 때문에 상속과 구현이 둘 다 있는 경우 상속인 extends를 먼저 해줘야한다.
	@Override
	public void sound() {
		System.out.println("짹짹");
	}

	@Override
	public void fly() {
		System.out.println("새 날기 ");
	}
}

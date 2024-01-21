package poly.diamond;

public class DiamondMain {
	public static void main(String[] args) {
		InterfaceA a = new Child();
		a.methodA();
		a.commonMethod();

		InterfaceB b = new Child();
		b.methodB();
		b.commonMethod();
		//인터페이스로 인한 다중 상속/ 다중 구현은 순수 추상 클래스라는 특징 때문에 문제를 발생하지 않는다.
		//InterfaceA를 통해 commonMethod()를 접근하든 InterfaceB를 통해 commonMethod()를 접근하든 Child 클래스에 오버라이딩되어 있는 메서드가 호출되기에 문제가 되지 않는다.
	}
}

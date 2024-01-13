package poly.overriding;

public class OverridingMain {
	public static void main(String[] args) {
		//자식 변수가 자식 인스턴스 참조
		Child child = new Child();
		System.out.println("Child -> Child");
		System.out.println("value = " + child.value);
		child.method();

		//부모 변수가 부모 인스턴스 참조
		Parent parent = new Parent();
		System.out.println("Parent -> Parent");
		System.out.println("value = " + parent.value);
		parent.method();

		//부모 변수가 자식 인스턴스 참조
		Parent poly = new Child();
		System.out.println("Parent -> Child");
		System.out.println("value = " + poly.value); //변수는 오버라이딩 X
		poly.method(); //메서드 오버라이딩!!

		//오버라이딩한 메서드가 항상 절대적..! 우선권을 가지기 때문에 poly.method()는 자식타입의 오버라이딩된 메서드가 호출된다.
	}
}

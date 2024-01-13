package poly.basic;

public class CastingMain6 {
	/*
	instanceof
	 */
	public static void main(String[] args) {
		Parent parent1 = new Parent();
		System.out.println("parent1 호출");
		call(parent1);

		Parent parent2 = new Child();
		System.out.println("parent2 호출");
		call(parent2);
	}

	private static void call(Parent parent) {
		parent.parentMethod();
		// Child 인스턴스인 경우  childMethod() 실행
		if (parent instanceof Child child) { // 다운캐스팅이 가능한지 확인할 수 있는 좋은 메서드
			System.out.println("Child 인스턴스 맞음");
			//Child child = (Child) parent; (이 주석의 과정을 instanceof Child child 로 바로 할 수 있음 (자바 16 이상)
			//parent가 Child의 인스턴스라면 Child child = (Child) parent 과정을 거쳐라 ( = parent instanceof Child child)
			child.childMethod();
		}
	}
}

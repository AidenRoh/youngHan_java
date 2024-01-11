package poly.basic;

//다운캐스팅을 동으로 하지 않는 이유
public class CastingMain4 {
	public static void main(String[] args) {
		Parent parent1 = new Child();
		Child child1 = (Child) parent1;
		child1.childMethod(); // 문제 없음

		Parent parent2 = new Parent();
		Child child2 = (Child) parent2;
		child2.childMethod();

		//첫번째 캐이스는 child 에 parent 의 인스턴스도 있기 때문에 가능하지만, 두 번째 같은 경우 parent 인스턴스만 존재하므로
		//오류를 발생하게 된다.
	}
}

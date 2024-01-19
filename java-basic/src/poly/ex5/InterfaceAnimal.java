package poly.ex5;

public interface InterfaceAnimal {
	void sound();

	void move();

	// 1. 인터페이스의 메서드는 public abstract가 생략되어 있다고 보면 된다.
	// 2. 인터페이스의 맴버 변수는 public static final 이 생략되어 있고 상수로서 인터페이스를 사용하는 클래스에 제공되는 느낌
	// 3. 인터페이스의 메서드는 순수 추상 클래스처럼 빈 껍데기이고 오버라이딩을 해야하므로, 다른 클래스들이 구현해야할 메서드라고 생각할 수 있다.
	// 그래서 인터페이스는 상속이 아니라 구현인 implement를 키워드를 통해 연결 가능
}

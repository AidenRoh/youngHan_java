package extends1.super2;

public class ClassC extends ClassB{

	public ClassC() {
		super(10, 20); //ClassB에는 생성자가 직접  정의 되어 있기 때문에, 기본생성자인 super()는 불가능하고 다음과 같이
		//만들어진 생성자의 파라미터 값을 맞춰주어야한다.
		System.out.println("ClassC 생성자");
	}
}

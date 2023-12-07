package ref;

public class NullMain2 {
	public static void main(String[] args) {
		Data data = null;
		data.value = 10; //NullPointerException 예외 발생
		/**
		 * NullPointerException은 주소지 없이 택배를 보내는 것 같이, 참조값이 없이 객체를 찾아가려고 할 때 발생한다.
		 * 객체를 참조할 때는 '.'(dot)을 사용한다. 하지만 참조값이 null이라면, null에 .(dot)을 찍었을 때 발생
		 * 이때 이 .(dot)이 포인터가 된다. --> Null Pointer == null.xx
		 */
		System.out.println("data = " + data.value);
	}
}

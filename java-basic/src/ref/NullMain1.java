package ref;

public class NullMain1 {
	public static void main(String[] args) {
		Data data = null;
		System.out.println("1. data = " + data);
		data = new Data();
		System.out.println("2. data = " + data);
		data = null;
		System.out.println("3. data = " + data);

		//GC (Garbage Collection) - 아무도 차모하지 않는 인스턴스의 최후
		//세 번째, data를 Null값으로 지정했을 때, 두 번째에 만들었던 인스턴스를 다시 구할 방법이 없다.
		//이런 인스턴스들은 GC에 의해서 자동적으로 제거된다.
	}
}

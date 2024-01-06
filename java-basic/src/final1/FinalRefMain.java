package final1;

public class FinalRefMain {
	public static void main(String[] args) {
		final Data data = new Data();
		//data = new Data(); // 불가능

		//참조 대상의 값은 변경 가능
		data.value = 10;
		System.out.println(data.value);
		data.value = 20;
		System.out.println(data.value);

		//즉 위의 final은 참조 변수 주소의 값을 바꿀 수 없게 만든 것이지 data 객체가 final이 된 것이 아니라는 뜻이다.
	}
}

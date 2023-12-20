package access.ex;

public class CounterMain {
	public static void main(String[] args) {
		MaxCounter counter = new MaxCounter(3);
		counter.increamt();
		counter.increamt();
		counter.increamt();
		counter.increamt();
		int count = counter.getCount();
		System.out.println(count);

	}
}

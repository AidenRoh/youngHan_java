package ref;

public class NullMain4 {
	public static void main(String[] args) {
		BigData bigData = new BigData();
		bigData.data = new Data();
		System.out.println("bigData.count = " + bigData.count);
		System.out.println("bigData.data = " + bigData.data);

		//NullPointerException 발생
		System.out.println("bigData.data.value =  " + bigData.data.value);
		//bigData.data == null이므로, null.value가 되어 예외가 발생한다.
	}
}


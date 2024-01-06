package final1;

public class ConstantMain1 {
	public static void main(String[] args) {
		System.out.println("프로글매 최대 참여자 수 " + 1000);
		int currnetUserCount = 999;

	}

	private static void process(int currentUserCount) {
		System.out.println("참여자 수: " + currentUserCount);
		if (currentUserCount > 1000) { //새로운 개발자가 이 숫자를 보았을 때, 한번에 파악하기 힘든 값을 매직넘버라고 부름
			System.out.println("대기자로 등록합니다.");
		}
		System.out.println("게임에 참여합니다.");
	}
}

package construct;

public class MethodInitMain3 {
	public static void main(String[] args) {
		Memberinit member1 = new Memberinit();
		member1.initMember("user1", 15, 90);

		Memberinit member2 = new Memberinit();
		member2.initMember("user2", 16, 80);

		Memberinit[] members = {member1, member2};

		for (Memberinit member : members) {
			System.out.println("이름:" + member.name + " 나이:" + member.age + " 성적:" + member.grade);
		}
	}
}

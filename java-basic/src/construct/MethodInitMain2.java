package construct;

public class MethodInitMain2 {
	public static void main(String[] args) {
		Memberinit member1 = new Memberinit();
		initMember(member1, "user1", 15, 90);

		Memberinit member2 = new Memberinit();
		initMember(member2, "user2", 16, 80);

		Memberinit[] members = {member1, member2};

		for (Memberinit member : members) {
			System.out.println("이름:" + member.name + " 나이:" + member.age + " 성적:" + member.grade);
		}
	}

	static void initMember(Memberinit member, String name, int age, int grade) {
		member.name = name;
		member.age = age;
		member.grade = grade;
	}
}

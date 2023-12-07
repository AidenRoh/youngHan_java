package class1;

public class ClassStart1 {
	public static void main(String[] args) {
		String student1Name = "학생1";
		int student1Age = 15;
		int student1Grade = 90;

		String student2Name = "학생1";
		int student2Age = 15;
		int student2Grade = 90;

		// ... 학생이 늘 때마다 계속 생성해야 하는 문제가 발생

		System.out.println("이름:" + student1Name + " 나이:" + student1Age + " 성적:" + student1Grade);
		System.out.println("이름:" + student2Name + " 나이:" + student2Age + " 성적:" + student2Grade);
	}
}

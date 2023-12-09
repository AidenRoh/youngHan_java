package construct;

public class MemberConstruct {
	String name;
	int age;
	int grade;

	//추가
	MemberConstruct(String name, int age) {
		this(name, age, 50); // 변경
		//this() 는 생성자 내에 첫번째 줄에서만 사용할 수 있다.
//		this.name = name;
//		this.age = age;
//		this.grade = 50;
	}

	MemberConstruct(String name, int age, int grade) {
		System.out.println("생성자 호출 name=" + name + " ,age=" + age + " ,grade=" + grade);
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
}

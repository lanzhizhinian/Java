package cn.com.tech_pupil;

public class TechPupilTest {

	public static void main(String[] args) {
		Student student = new Student("С��",11);
		student.eat();
		student.attendClass();
		
		System.out.println();
		
		Teacher teacher = new Teacher("С��",28);
		teacher.eat();
		teacher.giveLessons();
	}
	
}

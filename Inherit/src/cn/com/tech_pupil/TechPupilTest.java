package cn.com.tech_pupil;

public class TechPupilTest {

	public static void main(String[] args) {
		Student student = new Student("Ğ¡Ã÷",11);
		student.eat();
		student.attendClass();
		
		System.out.println();
		
		Teacher teacher = new Teacher("Ğ¡Àö",28);
		teacher.eat();
		teacher.giveLessons();
	}
	
}

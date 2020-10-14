package cn.com.tech_pupil;

public class Teacher extends Person{
	
	public Teacher() {
		;
	}
	
	public Teacher(String name,int age) {
		super(name,age);
	}
	
	public void giveLessons() {
		System.out.println(this.getName()+"ÕıÔÚÊÚ¿Î");
	}

}

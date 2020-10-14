package cn.com.tech_pupil;

public class Student extends Person{

	public Student() {
		;
	}
	public Student(String name,int age) {
		super(name,age);
	}
	
	public void attendClass() {
		System.out.println(this.getName()+"х╔ио©нак");
	}
	
}

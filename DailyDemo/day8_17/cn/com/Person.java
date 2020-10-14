package cn.com;

public class Person {

	private int age;
	private char sex;
	
	
	public Person() {
		this.age = 22;
		this.sex = '男';
	}

	public String show(int age) {
		System.out.println("Person类的传int型的方法");
		return age+"";
	}
	
	public void show(int age,char sex) {
		System.out.println("Person类的传int,char型的方法");
	}
	
	public void show() {
		System.out.println("Person类的不传参数的方法");
	}

	public int getAge() {
		return age;
	}


	public char getSex() {
		return sex;
	}
	
	
	
}

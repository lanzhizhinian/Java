package cn.com;

public class Person {

	private int age;
	private char sex;
	
	
	public Person() {
		this.age = 22;
		this.sex = '��';
	}

	public String show(int age) {
		System.out.println("Person��Ĵ�int�͵ķ���");
		return age+"";
	}
	
	public void show(int age,char sex) {
		System.out.println("Person��Ĵ�int,char�͵ķ���");
	}
	
	public void show() {
		System.out.println("Person��Ĳ��������ķ���");
	}

	public int getAge() {
		return age;
	}


	public char getSex() {
		return sex;
	}
	
	
	
}

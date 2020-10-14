package day7_30;

public class Student {
	private String name;
	private String stuNo;
	private String address;
	private int age;
	private char sex;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStuNo() {
		return stuNo;
	}

	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}
	
	public Student() {
		//System.out.println("this:"+this);
	}
	
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public Student(int age,String name) {
		this.age = age;
		this.name = name;
	}
	
	public Student(char sex) {
		this.sex = sex;
	}
	
	public Student(int age) {
		this.age = age;
	}
	

}

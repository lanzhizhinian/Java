package cn.com;

public class Student1{
	
	private String userName;
	private String pwd;
	protected int age;
	public int height;
	char sex;
	
	public Student1() {
		System.out.println("Student1的无参构造方法被执行");
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	public void print() {
		System.out.println("无参方法！");
	}
	
}

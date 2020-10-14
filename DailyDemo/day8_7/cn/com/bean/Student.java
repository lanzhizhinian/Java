package cn.com.bean;
import java.io.Serializable;

public class Student implements Serializable{

	private int age;
	private transient String name;
	private String no;
	
	
	public Student(int age, String name, String no) {
		super();
		this.age = age;
		this.name = name;
		this.no = no;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	
	
	
}

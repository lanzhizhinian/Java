package cn.com.beans;

public class TestBean {

	private int age = 22;
	public String name = "黄鹏飞";
	protected String address = "湖南郴州";
	char sex = '男';
	
	private void print(Integer age,String name) {
		this.age = age;
		this.name = name;
		System.out.println(this.age+" : "+this.name);
	}
	
	protected void print(Integer age,String name,String address) {
		this.age = age;
		this.name = name;
		this.address = address;
		System.out.println(this.age+" : "+this.name+" : "+this.address);
	}
	
	int print(Integer age) {
		this.age = age;
		return age;
	}
	
	public void print(Character sex) {
		System.out.println(this.sex);
	}
	
	public void print() {
		System.out.println("TestBean的无参打印函数！");
	}
	
}

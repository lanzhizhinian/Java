package cn.com.bean;

public class StudentBean {

	private String stuNo;
	private String stuName;
	private String stuPassword;
	private int age;
	private char sex;
	private String addr;
	
	public StudentBean() {
		
	}
	
	public StudentBean(String stuNo,String stuPassword,String stuName,int age,char sex,String addr) {
		this.stuPassword = stuPassword;
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.age = age;
		this.sex = sex;
		this.addr = addr;
	}
	
	
	public String getStuPassword() {
		return stuPassword;
	}

	public void setStuPassword(String stuPassword) {
		this.stuPassword = stuPassword;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getStuNo() {
		return stuNo;
	}
	
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}

	public String getStuName() {
		return stuName;
	}
	
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return this.getStuNo()+"\t\t"+this.getStuPassword()+"\t"+this.getStuName()+"\t\t"+this.getAge()
		+"\t"+this.getSex()+"\t"+this.getAddr();
	}
	
}

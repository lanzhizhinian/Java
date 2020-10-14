package cn.com.exception;

import java.util.zip.DataFormatException;

public class Person {

	private String name;
	private int age;
	private char sex;
	
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) throws AgeException{
		
		if(sex != '男' && sex != '女') {
			throw (new AgeException("性别输入有误，请重新输入"));
		}
		
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}

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
		
		if(sex != '��' && sex != 'Ů') {
			throw (new AgeException("�Ա�������������������"));
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

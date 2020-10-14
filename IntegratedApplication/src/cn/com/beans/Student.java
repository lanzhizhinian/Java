package cn.com.beans;
import java.io.Serializable;

public class Student implements Serializable{

	private String stuNo;
	private int age;
	private float weight;
	private transient long identity;
	
	
	public String getStuNo() {
		return stuNo;
	}
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public long getIdentity() {
		return identity;
	}
	public void setIdentity(long identity) {
		this.identity = identity;
	}
	
	@Override
	public String toString() {
		return this.getStuNo()+"\t"+this.getIdentity()+"\t"+this.getAge()+"\t"+this.getWeight();
	}
	
}

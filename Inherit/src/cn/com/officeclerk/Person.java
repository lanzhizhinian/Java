package cn.com.officeclerk;

public class Person {
	
	private String name;
	private String jobNumber;
	private float salary;
	
	public Person() {
		;
	}

	public Person(String name,String jobNumber,float salary) {
		this.name = name;
		this.jobNumber = jobNumber;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobNumber() {
		return jobNumber;
	}

	public void setJobNumber(String jobNumber) {
		this.jobNumber = jobNumber;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public void showPersonInfo() {
		System.out.print("ÐÕÃû£º\t");
		System.out.println(this.getName());
		System.out.print("¹¤ºÅ£º\t");
		System.out.println(this.getJobNumber());
		System.out.print("Ð½×Ê£º\t");
		System.out.println(this.getSalary());
	}
	
}

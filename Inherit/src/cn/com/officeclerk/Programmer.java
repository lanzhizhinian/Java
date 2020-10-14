package cn.com.officeclerk;

public class Programmer extends Person{

	public Programmer() {
		;
	}
	
	public Programmer(String name,String jobNumber,float salary) {
		super(name,jobNumber,salary);
	}
	
	
	public void showProgrammer() {
		super.showPersonInfo();
	}
	
}

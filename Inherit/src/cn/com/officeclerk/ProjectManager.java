package cn.com.officeclerk;

public class ProjectManager extends Person{

	private float bonus;
	
	public ProjectManager() {
		;
	}
	
	public ProjectManager(String name,String jobNumber,float salary,float bonus) {
		super(name,jobNumber,salary);
		this.bonus = bonus;
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	
	public void showProjectMenager() {
		this.showPersonInfo();
		System.out.print("½±½ð£º\t");
		System.out.println(this.bonus);
	}
	
}

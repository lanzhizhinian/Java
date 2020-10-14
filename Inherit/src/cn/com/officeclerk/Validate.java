package cn.com.officeclerk;

public class Validate {
	
	public boolean validateBySalary(float salary) {
		
		return salary < 0? true:false;
		
	}
	
	public boolean validateByBonus(float bonus) {
		
		return bonus < 0? true:false;
		
	}
	
}

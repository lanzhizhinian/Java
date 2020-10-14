package cn.com.animal;

public abstract class Animal {

	private String coatColor;
	private int numOfLegs;
	
	public Animal() {
		;
	}
	public Animal(String coatColor,int numOfLegs) {
		this.coatColor = coatColor;
		this.numOfLegs = numOfLegs;
	}
	
	protected abstract void behavior();
	
	public String getCoatColor() {
		return coatColor;
	}
	public void setCoatColor(String coatColor) {
		this.coatColor = coatColor;
	}
	public int getNumOfLegs() {
		return numOfLegs;
	}
	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	} 
	
	
	
}

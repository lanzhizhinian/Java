package cn.com.vehicle;

public class Car extends Vehicle{

	private String color;
	
	public Car() {
		;
	}

	public Car getCar() {
		return this;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}

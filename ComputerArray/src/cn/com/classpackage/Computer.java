package cn.com.classpackage;

/**
 * 要求：序列号不重复
 * @author yunsuowu
 *weight > 1.2
 */
public class Computer {
	private String brand;
	private String series;
	private String serialNumber;
	private float weight;
	
	public Computer(Computer computer) {
		this.brand = computer.brand;
		this.series = computer.series;
		this.serialNumber = computer.serialNumber;
		this.weight = computer.weight;
	}
	public Computer() {
		;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	
}

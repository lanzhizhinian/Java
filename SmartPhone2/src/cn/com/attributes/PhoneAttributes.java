package cn.com.attributes;

public class PhoneAttributes {

	private String attName;
	private Object attValue;
	
	public PhoneAttributes() {
		
	}
	public PhoneAttributes(String attName,Object attValue) {
		this.attName = attName;
		this.attValue = attValue;
	}
	
	public String getAttName() {
		return attName;
	}
	public void setAttName(String attName) {
		this.attName = attName;
	}
	public Object getAttValue() {
		return attValue;
	}
	public void setAttValue(Object attValue) {
		this.attValue = attValue;
	}
	
	
}

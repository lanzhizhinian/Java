package cn.com.impl;
import java.util.List;
import cn.com.attr.Attribute;
import cn.com.inf.BubleInf;

public class LED implements BubleInf {

	private List<Attribute> atts;
	
	@Override
	public void setAtts(List<Attribute> atts) {
		this.atts = atts;
	}

	@Override
	public List<Attribute> getAtts() {
		return this.atts;
	}

	@Override
	public void lightOn() {
		System.out.println("LEDµÆÁÁÁË");
	}

	@Override
	public void lightOff() {
		System.out.println("LEDµÆÃğÁË");
	}

}

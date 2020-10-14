package cn.com.inf;

import java.util.List;

import cn.com.attr.Attribute;

public interface BubleInf {

	void setAtts(List<Attribute> atts);
	List<Attribute> getAtts();
	void lightOn();
	void lightOff();
	
}

package cn.com.smartphone2.baseinf;
import cn.com.attributes.PhoneAttributes;

public interface BaseInf {

	void call();
	void msg();
	void camera();
	void blueTooth();
	void gps();
	PhoneAttributes[] getAttributes();
	void setPhoneAttributes(PhoneAttributes[] atts);
}

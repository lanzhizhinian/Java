package cn.com.smartphone2.obstract;
import cn.com.attributes.PhoneAttributes;
import cn.com.smartphone2.baseinf.BaseInf;

public abstract class HuaWei implements BaseInf{

	private PhoneAttributes[] atts;
	
	public PhoneAttributes[] getAttributes() {
		return this.atts;
	}
	
	public void setPhoneAttributes(PhoneAttributes[] atts) {
		this.atts = atts;
	}
}

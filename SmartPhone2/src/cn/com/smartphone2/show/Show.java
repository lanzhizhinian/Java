package cn.com.smartphone2.show;

import cn.com.attributes.PhoneAttributes;
import cn.com.smartphone2.baseinf.BaseInf;

public class Show {

	public void show(BaseInf phone) {
		System.out.println("以下是当前手机的所有信息：");
		PhoneAttributes[] atts = phone.getAttributes();
		for(PhoneAttributes att:atts) {
			System.out.println("参数名：" +att.getAttName()+"\t参数值\t"+att.getAttValue());
		}
		phone.call();
		phone.msg();
		phone.gps();
		phone.camera();
		phone.blueTooth();
	}
	
}

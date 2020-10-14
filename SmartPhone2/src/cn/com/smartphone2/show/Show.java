package cn.com.smartphone2.show;

import cn.com.attributes.PhoneAttributes;
import cn.com.smartphone2.baseinf.BaseInf;

public class Show {

	public void show(BaseInf phone) {
		System.out.println("�����ǵ�ǰ�ֻ���������Ϣ��");
		PhoneAttributes[] atts = phone.getAttributes();
		for(PhoneAttributes att:atts) {
			System.out.println("��������" +att.getAttName()+"\t����ֵ\t"+att.getAttValue());
		}
		phone.call();
		phone.msg();
		phone.gps();
		phone.camera();
		phone.blueTooth();
	}
	
}

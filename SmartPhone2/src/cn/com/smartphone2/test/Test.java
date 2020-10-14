package cn.com.smartphone2.test;
import cn.com.attributes.PhoneAttributes;
import cn.com.smartphone2.abstractImpl.HighEndPhone;
import cn.com.smartphone2.abstractImpl.LowEndPhone;
import cn.com.smartphone2.abstractImpl.MediumEndPhone;
import cn.com.smartphone2.show.Show;

public class Test {

	public static void main(String[] args) {
		Show show = new Show();
		HighEndPhone phone = new HighEndPhone();
		PhoneAttributes[] atts = new PhoneAttributes[] {new PhoneAttributes("�ڴ�","8G"),new PhoneAttributes("��Ļ�ߴ�","6.5Ӣ��")};
		phone.setPhoneAttributes(atts);
		show.show(phone);
		
		System.out.println("-------------");
		MediumEndPhone phone2 = new MediumEndPhone();
		atts = new PhoneAttributes[] {new PhoneAttributes("�洢����","128G"),new PhoneAttributes("������ɫ","��ɫ")};
		phone2.setPhoneAttributes(atts);
		show.show(phone2);
		
		System.out.println("-------------");
		LowEndPhone phone3 = new LowEndPhone();
		atts = new PhoneAttributes[] {new PhoneAttributes("��Ļˢ����","90Hz"),new PhoneAttributes("������","Kirin990")};
		phone3.setPhoneAttributes(atts);
		show.show(phone3);
	}
	
}

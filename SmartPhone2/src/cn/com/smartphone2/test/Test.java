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
		PhoneAttributes[] atts = new PhoneAttributes[] {new PhoneAttributes("内存","8G"),new PhoneAttributes("屏幕尺寸","6.5英寸")};
		phone.setPhoneAttributes(atts);
		show.show(phone);
		
		System.out.println("-------------");
		MediumEndPhone phone2 = new MediumEndPhone();
		atts = new PhoneAttributes[] {new PhoneAttributes("存储容量","128G"),new PhoneAttributes("机身颜色","黑色")};
		phone2.setPhoneAttributes(atts);
		show.show(phone2);
		
		System.out.println("-------------");
		LowEndPhone phone3 = new LowEndPhone();
		atts = new PhoneAttributes[] {new PhoneAttributes("屏幕刷新率","90Hz"),new PhoneAttributes("处理器","Kirin990")};
		phone3.setPhoneAttributes(atts);
		show.show(phone3);
	}
	
}

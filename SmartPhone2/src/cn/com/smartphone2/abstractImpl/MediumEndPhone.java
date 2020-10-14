package cn.com.smartphone2.abstractImpl;
import cn.com.attributes.PhoneAttributes;
import cn.com.smartphone2.obstract.HuaWeiN;

public class MediumEndPhone extends HuaWeiN{

	@Override
	public void call() {
		System.out.println("我是华为nova7的语音助手小艺，打电话给你");
	}

	@Override
	public void msg() {
		System.out.println("我是华为nova7的语音助手小艺，发短信给你");
	}

	@Override
	public void camera() {
		System.out.println("华为nova7，没有潜望式");
	}

	@Override
	public void blueTooth() {
		System.out.println("我有蓝牙4.1");
	}


}

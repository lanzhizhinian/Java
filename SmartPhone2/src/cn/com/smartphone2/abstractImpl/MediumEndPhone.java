package cn.com.smartphone2.abstractImpl;
import cn.com.attributes.PhoneAttributes;
import cn.com.smartphone2.obstract.HuaWeiN;

public class MediumEndPhone extends HuaWeiN{

	@Override
	public void call() {
		System.out.println("���ǻ�Ϊnova7����������С�գ���绰����");
	}

	@Override
	public void msg() {
		System.out.println("���ǻ�Ϊnova7����������С�գ������Ÿ���");
	}

	@Override
	public void camera() {
		System.out.println("��Ϊnova7��û��Ǳ��ʽ");
	}

	@Override
	public void blueTooth() {
		System.out.println("��������4.1");
	}


}

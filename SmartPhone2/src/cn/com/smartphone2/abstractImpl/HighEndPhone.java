package cn.com.smartphone2.abstractImpl;
import cn.com.smartphone2.baseinf.BaseInf;
import cn.com.smartphone2.obstract.HuaWeiH;

public class HighEndPhone extends HuaWeiH {

	@Override
	public void call() {
		System.out.println("���ǻ�Ϊmate40����������С�գ���绰����");
	}

	@Override
	public void msg() {
		System.out.println("���ǻ�Ϊmate40����������С�գ������Ÿ���");
	}

	@Override
	public void camera() {
		System.out.println("��Ϊmate40��������Ǳ��ʽ");
	}

	@Override
	public void blueTooth() {
		System.out.println("��������5.0");
	}

	@Override
	public void gps() {
		System.out.println("����GPS����");
	}

}

package cn.com.smartphone2.abstractImpl;

import cn.com.smartphone2.obstract.HuaWeiL;

public class LowEndPhone extends HuaWeiL {

	@Override
	public void call() {
		System.out.println("���ǻ�Ϊ����10����������С�գ���绰����");
	}

	@Override
	public void msg() {
		System.out.println("���ǻ�Ϊ����10����������С�գ������Ÿ���");
	}

}

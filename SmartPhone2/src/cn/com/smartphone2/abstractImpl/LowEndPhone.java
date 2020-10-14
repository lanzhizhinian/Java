package cn.com.smartphone2.abstractImpl;

import cn.com.smartphone2.obstract.HuaWeiL;

public class LowEndPhone extends HuaWeiL {

	@Override
	public void call() {
		System.out.println("我是华为畅想10的语音助手小艺，打电话给你");
	}

	@Override
	public void msg() {
		System.out.println("我是华为畅想10的语音助手小艺，发短信给你");
	}

}

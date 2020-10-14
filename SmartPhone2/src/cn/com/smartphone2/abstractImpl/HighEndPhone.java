package cn.com.smartphone2.abstractImpl;
import cn.com.smartphone2.baseinf.BaseInf;
import cn.com.smartphone2.obstract.HuaWeiH;

public class HighEndPhone extends HuaWeiH {

	@Override
	public void call() {
		System.out.println("我是华为mate40的语音助手小艺，打电话给你");
	}

	@Override
	public void msg() {
		System.out.println("我是华为mate40的语音助手小艺，发短信给你");
	}

	@Override
	public void camera() {
		System.out.println("华为mate40，有两个潜望式");
	}

	@Override
	public void blueTooth() {
		System.out.println("我有蓝牙5.0");
	}

	@Override
	public void gps() {
		System.out.println("我有GPS功能");
	}

}

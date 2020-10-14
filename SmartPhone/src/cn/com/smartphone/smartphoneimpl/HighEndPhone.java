package cn.com.smartphone.smartphoneimpl;

import cn.com.smartphone.smartphoneinf.HighLevelPhone;

public class HighEndPhone extends MediumEndPhone implements HighLevelPhone{

	public HighEndPhone() {
		super();
	}
	public HighEndPhone(String[] functions) {
		super(functions);
	}
	
	@Override
	public void showFunction() {
		String[] functions = super.getFunctions();
		// TODO Auto-generated method stub
		System.out.println("当前手机为高端机，它的功能展示如下：");
		this.commitCallUp("764589", "093854");
		this.commitSendMessage("764589", "093854");
		this.TakePicture();
		this.BlueTooth();
		this.commitGPS();
		for(int i = 0;i < functions.length;i++) {
			System.out.println("执行  "+functions[i]+"  功能");
		}
	}

	public void commitCallUp(String tel1,String tel2) {
		System.out.println(tel1+"打电话给"+tel2);
	}
	@Override
	public void commitSendMessage(String tel1,String tel2) {
		System.out.println(tel1+"发短信给"+tel2);
	}
	@Override
	public void TakePicture() {
		System.out.println("执行拍照功能");
	}
	@Override
	public void BlueTooth() {
		System.out.println("执行蓝牙功能");
	}
	@Override
	public void commitGPS() {
		System.out.println("执行GPS功能");
	}
	@Override
	public void setFunction(int size) {
		super.setFunction(size);
	}
	
}

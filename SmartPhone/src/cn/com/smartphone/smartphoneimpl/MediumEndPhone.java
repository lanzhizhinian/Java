package cn.com.smartphone.smartphoneimpl;

import cn.com.smartphone.smartphoneinf.MediumLevelPhone;

public class MediumEndPhone extends LowEndPhone implements MediumLevelPhone{

	public MediumEndPhone() {
		super();
	}
	public MediumEndPhone(String[] functions) {
		super(functions);
	}
	
	public void showFunction() {
		String[] functions = super.getFunctions();
		System.out.println("当前手机为中端机，它的种功能展示如下：");
		this.commitCallUp("675734", "768947");
		this.commitSendMessage("675734", "768947");
		this.TakePicture();
		this.BlueTooth();
		for(int i = 0;i < functions.length;i++) {
			System.out.println("执行  "+functions[i]+"  方法");
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
	public void setFunction(int size) {
		super.setFunction(size);;
	}

}

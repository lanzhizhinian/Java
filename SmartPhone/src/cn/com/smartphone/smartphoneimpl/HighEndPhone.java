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
		System.out.println("��ǰ�ֻ�Ϊ�߶˻������Ĺ���չʾ���£�");
		this.commitCallUp("764589", "093854");
		this.commitSendMessage("764589", "093854");
		this.TakePicture();
		this.BlueTooth();
		this.commitGPS();
		for(int i = 0;i < functions.length;i++) {
			System.out.println("ִ��  "+functions[i]+"  ����");
		}
	}

	public void commitCallUp(String tel1,String tel2) {
		System.out.println(tel1+"��绰��"+tel2);
	}
	@Override
	public void commitSendMessage(String tel1,String tel2) {
		System.out.println(tel1+"�����Ÿ�"+tel2);
	}
	@Override
	public void TakePicture() {
		System.out.println("ִ�����չ���");
	}
	@Override
	public void BlueTooth() {
		System.out.println("ִ����������");
	}
	@Override
	public void commitGPS() {
		System.out.println("ִ��GPS����");
	}
	@Override
	public void setFunction(int size) {
		super.setFunction(size);
	}
	
}

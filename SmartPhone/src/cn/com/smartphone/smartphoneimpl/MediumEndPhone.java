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
		System.out.println("��ǰ�ֻ�Ϊ�ж˻��������ֹ���չʾ���£�");
		this.commitCallUp("675734", "768947");
		this.commitSendMessage("675734", "768947");
		this.TakePicture();
		this.BlueTooth();
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
	public void setFunction(int size) {
		super.setFunction(size);;
	}

}

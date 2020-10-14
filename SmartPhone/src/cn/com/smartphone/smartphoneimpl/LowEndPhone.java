package cn.com.smartphone.smartphoneimpl;
import cn.com.smartphone.smartphoneinf.LowLevelPhone;

public class LowEndPhone implements LowLevelPhone{

	private String[] functions;
	private int index;
	
	public LowEndPhone() {
		
	}
	public LowEndPhone(String[] functions) {
		this.functions = functions;
		this.index = functions.length;
	}
	
	@Override
	public void showFunction() {
		// TODO Auto-generated method stub
		System.out.println("��ǰ�ֻ�Ϊ�Ͷ˻������Ĺ���չʾ���£�");
		this.commitCallUp("3472385", "7653748");
		this.commitSendMessage("3472385", "7653748");
		for(int i = 0;i < this.functions.length;i++) {
			System.out.println("ִ�� "+this.functions[i]+" ����");
		}
	}
	
	@Override
	public void commitCallUp(String tel1,String tel2) {
		System.out.println("ִ�д�绰�Ĺ���");
	}
	@Override
	public void commitSendMessage(String tel1,String tel2) {
		System.out.println("ִ�з����Ź���");
	}
	
	@Override
	public void setFunction(int size) {
		this.functions = new String[size];
	}
	public int getIndex() {
		return this.index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String[] getFunctions() {
		return this.functions;
	}

}

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
		System.out.println("当前手机为低端机，它的功能展示如下：");
		this.commitCallUp("3472385", "7653748");
		this.commitSendMessage("3472385", "7653748");
		for(int i = 0;i < this.functions.length;i++) {
			System.out.println("执行 "+this.functions[i]+" 功能");
		}
	}
	
	@Override
	public void commitCallUp(String tel1,String tel2) {
		System.out.println("执行打电话的功能");
	}
	@Override
	public void commitSendMessage(String tel1,String tel2) {
		System.out.println("执行发短信功能");
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

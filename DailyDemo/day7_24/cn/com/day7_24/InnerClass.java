package cn.com.day7_24;

public class InnerClass {

	private int component;
	
	public InnerClass() {
		System.out.println("�ⲿ��InnerClass����ʼ��");
	}
	
	public int getComponent() {
		return component;
	}

	public void setComponent(int component) {
		this.component = component;
	}
	

	class Inner{
		private int incomponent;
		public Inner() {
			System.out.println("�ڲ���inner����ʼ��������");
		}
		
		public void getOutterComp() {
			System.out.println(component);
		}
		
	}
	
}

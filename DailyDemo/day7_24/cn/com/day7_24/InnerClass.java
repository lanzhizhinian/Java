package cn.com.day7_24;

public class InnerClass {

	private int component;
	
	public InnerClass() {
		System.out.println("外部类InnerClass被初始化");
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
			System.out.println("内部类inner被初始化。。。");
		}
		
		public void getOutterComp() {
			System.out.println(component);
		}
		
	}
	
}

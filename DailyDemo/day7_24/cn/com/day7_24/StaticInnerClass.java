package cn.com.day7_24;

public class StaticInnerClass {

	public StaticInnerClass() {
		System.out.println("�ⲿ�౻��ʼ��������");
	}
	
	
	public static class Inner {
		
		public Inner() {
			System.out.println("��̬�ڲ��౻��ʼ��������");
		}
		
		public static StaticInnerClass hello() {
			StaticInnerClass sic = new StaticInnerClass();
			return sic;
		}
		
		public static void sayHello() {
			System.out.println("Hello,��á�");
		}
		
		public void test() {
			
		}
		
	}
	
}

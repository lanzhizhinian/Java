package cn.com.day7_24;

public class StaticInnerClass {

	public StaticInnerClass() {
		System.out.println("外部类被初始化。。。");
	}
	
	
	public static class Inner {
		
		public Inner() {
			System.out.println("静态内部类被初始化。。。");
		}
		
		public static StaticInnerClass hello() {
			StaticInnerClass sic = new StaticInnerClass();
			return sic;
		}
		
		public static void sayHello() {
			System.out.println("Hello,你好。");
		}
		
		public void test() {
			
		}
		
	}
	
}

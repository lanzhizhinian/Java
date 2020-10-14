package cn.com.day7_24;

public class StaticInnerCLassTest {

	public static void main(String[] args) {
		
		StaticInnerClass sic = new StaticInnerClass();
		
		System.out.println("----------------");
		System.out.println(StaticInnerClass.Inner.hello().getClass());
		
		StaticInnerClass.Inner in = new StaticInnerClass.Inner();
		StaticInnerClass.Inner.sayHello();

	}
	
}

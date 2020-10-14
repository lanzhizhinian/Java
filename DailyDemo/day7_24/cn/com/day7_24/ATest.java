package cn.com.day7_24;

public class ATest {

	public static void main(String[] args) {
		A a = new A();
		a.say(new B() {

			@Override
			public void sayHello() {
				// TODO Auto-generated method stub
				System.out.println("¹þ¹þ¹þ");
				System.out.println(this.getClass().getName());
			}
			
			public void sayTest() {
				System.out.println("À²À²À²");
			}
			
		});
		
		a.say(new B() {

			@Override
			public void sayHello() {
				// TODO Auto-generated method stub
				System.out.println("¹þ¹þ¹þ");
				System.out.println(this.getClass().getName());
			}
			
			public void sayTest() {
				System.out.println("À²À²À²");
			}
			
		});
		a.say(new B() {

			@Override
			public void sayHello() {
				// TODO Auto-generated method stub
				System.out.println("¹þ¹þ¹þ");
				System.out.println(this.getClass().getName());
			}
			
			public void sayTest() {
				System.out.println("À²À²À²");
			}
			
		});
	}
	
}

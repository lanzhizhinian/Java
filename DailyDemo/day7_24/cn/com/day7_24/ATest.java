package cn.com.day7_24;

public class ATest {

	public static void main(String[] args) {
		A a = new A();
		a.say(new B() {

			@Override
			public void sayHello() {
				// TODO Auto-generated method stub
				System.out.println("������");
				System.out.println(this.getClass().getName());
			}
			
			public void sayTest() {
				System.out.println("������");
			}
			
		});
		
		a.say(new B() {

			@Override
			public void sayHello() {
				// TODO Auto-generated method stub
				System.out.println("������");
				System.out.println(this.getClass().getName());
			}
			
			public void sayTest() {
				System.out.println("������");
			}
			
		});
		a.say(new B() {

			@Override
			public void sayHello() {
				// TODO Auto-generated method stub
				System.out.println("������");
				System.out.println(this.getClass().getName());
			}
			
			public void sayTest() {
				System.out.println("������");
			}
			
		});
	}
	
}

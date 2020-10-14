package cn.com.day7_24;


public class InnerClassTest {

	public static void main(String[] args) {
		InnerClass innercla = new InnerClass();
		InnerClass.Inner in = innercla.new Inner();
		in.getOutterComp();
	}
	
}

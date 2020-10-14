package cn.com.exception;

public class test4 {

	public static void main(String[] args) {

		int a = 4;
		try {
			assert a == 7 : a == 6;
		}catch (AssertionError e) {
			e.printStackTrace();
		}finally {
			System.out.println("À²À²À²");
		}
		
	}

}

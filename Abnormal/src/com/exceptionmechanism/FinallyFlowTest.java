package com.exceptionmechanism;

public class FinallyFlowTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		boolean a = test();
		System.out.println(a);
	}
	
	public static boolean test() {
		try {
			return false;
		}finally {
			return true;
		}
	}

}

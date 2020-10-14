package cn.com.exception;

import java.io.IOException;

public class test {

	public static void main(String[] args) {
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			System.out.println(num1/num2);
		}catch(Exception ex) {
			if(ex instanceof ArrayIndexOutOfBoundsException) {
				System.out.println(ex.getMessage());
			}else if(ex instanceof ArithmeticException) {
				//System.out.println(ex.getLocalizedMessage());
				ex.printStackTrace();
			}else if(ex instanceof NumberFormatException) {
				ex.printStackTrace();
			}else if(ex instanceof IOException) {
				ex.printStackTrace();
			}
		}
	}

}

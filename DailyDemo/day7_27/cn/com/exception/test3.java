package cn.com.exception;

import java.io.IOException;
import java.sql.SQLException;

public class test3 {
	public static void main(String[] args) {
		div(args);
	}
	
	static void div(String[] args) {
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			System.out.println(num1/num2);
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("数组下标越界");
		}catch(ArithmeticException ae) {
			System.out.println("算数异常"+ae.getMessage());
		}catch(NumberFormatException nfe) {
			//System.out.println("转换异常");
			nfe.printStackTrace();
		}catch(Exception ex) {
			if(ex instanceof IOException) {
				ex.printStackTrace();	
			}else if(ex instanceof SQLException) {
				ex.printStackTrace();
			}
		}
	}
	
}

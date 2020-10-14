package com.exceptionmechanism;

public class exceptest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a/b;
			System.out.println("您输入的两个数 "+a+"、 "+b+"相除的结果为："+c);
		}catch (IndexOutOfBoundsException | NumberFormatException | ArithmeticException ie)
		{
			System.out.println("程序出现数组越界、数据格式异常、算数异常之一");
		}
		catch(Exception e) {
			System.out.println("未知异常");
			e = new Exception("test2");
		}
	}

}

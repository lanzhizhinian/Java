package com.exceptionmechanism;

public class exceptest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a/b;
			System.out.println("������������� "+a+"�� "+b+"����Ľ��Ϊ��"+c);
		}catch (IndexOutOfBoundsException | NumberFormatException | ArithmeticException ie)
		{
			System.out.println("�����������Խ�硢���ݸ�ʽ�쳣�������쳣֮һ");
		}
		catch(Exception e) {
			System.out.println("δ֪�쳣");
			e = new Exception("test2");
		}
	}

}

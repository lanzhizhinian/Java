package cn.com.regularexpression;
import java.util.Scanner;

public class RegularExpression2 {
	/*
	 *
	 * �жϹ��� String���punlic static matches (String regex);
	 */
	public static void main(String[] args) {
		    Scanner sc =new Scanner(System.in);
		    System.out.println("���������");
		    String email = sc.nextLine(); 
	        
		    //�����������
	        String regex = "[a-zA-Z_0-9]+@[a-z_0-9] {2,6}(\\.[a-zA-z_0-9] {2,3})+";
	        //String regex = "\\w+@\\w {2,6}(\\.\\w {2,3})+";		
	        //���ù��ܣ��ж�		
	        boolean flag = email.matches(regex);
	        
	        //������
	        System.out.println(flag);
		}

}

package cn.com.regularexpression;
import java.util.Scanner;

public class RegularExpression2 {
	/*
	 *
	 * 判断功能 String类的punlic static matches (String regex);
	 */
	public static void main(String[] args) {
		    Scanner sc =new Scanner(System.in);
		    System.out.println("请输入号码");
		    String email = sc.nextLine(); 
	        
		    //定义邮箱规则
	        String regex = "[a-zA-Z_0-9]+@[a-z_0-9] {2,6}(\\.[a-zA-z_0-9] {2,3})+";
	        //String regex = "\\w+@\\w {2,6}(\\.\\w {2,3})+";		
	        //调用功能，判断		
	        boolean flag = email.matches(regex);
	        
	        //输出结果
	        System.out.println(flag);
		}

}

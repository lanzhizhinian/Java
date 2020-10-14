package cn.com.regularexpression;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	/*
	 * 概述：
	 * 正则表达式：符合一定规则的字符串
	 */
		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
		    System.out.println("请输入号码");
		    String qq = sc.nextLine(); 
	        System.out.println("QQ:"+checkQQ(qq));

		}
		public static boolean checkQQ(String qq) {
			String regex ="[1-9][0-9]{4,14}";
			//public boolean matches(String regex)告知此字符串是否匹配给正则表达式
		    boolean flag =qq.matches(regex);
		    return flag;	
			
			/*boolean flag = false;
			  try{
			   String check = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
			   Pattern regex = Pattern.compile(check);
			   Matcher matcher = regex.matcher(qq);
			   flag = matcher.matches();
			  }catch(Exception e){
			   System.out.println("邮箱信息输入有误，请重新输入");;
			   flag = false;
			  }
			  
			  return flag;*/
			
		} 

}

package cn.com.regularexpression;

public class RegularExprssion5 {
	/*
	 * 替换功能 String类的public String replaceAll(String regex,String replacement)
	 * 
	 * 
	 */
	public static void main(String[] args) {
		String s = "hello55123216word1321java";

		// 数字用*替换掉
		// String regex = "\\d+";

		String regex = "\\d";
		String ss = "*";

		String reslut = s.replaceAll(regex, ss);
		System.out.println(reslut);
	}

}

package cn.com.regularexpression;

public class RegularExprssion5 {
	/*
	 * �滻���� String���public String replaceAll(String regex,String replacement)
	 * 
	 * 
	 */
	public static void main(String[] args) {
		String s = "hello55123216word1321java";

		// ������*�滻��
		// String regex = "\\d+";

		String regex = "\\d";
		String ss = "*";

		String reslut = s.replaceAll(regex, ss);
		System.out.println(reslut);
	}

}

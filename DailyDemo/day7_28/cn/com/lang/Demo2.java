package cn.com.lang;

public class Demo2 {

	public static void main(String[] args) {
		String s1 = "sss";
		String s2 = "";
		String s3 = new String("sss");
		char[] s4 = new char[] {'s','s','s'};
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		String s5 = "abc";
		String s6 = s5+"def";
		System.out.println(s6 == "abcdef");
		
		Boolean a = new Boolean("true");
		Boolean b = new Boolean("hgudfj");
		if(a) {
			System.out.println(a);
			System.out.println(b);
		}
		
	}

}

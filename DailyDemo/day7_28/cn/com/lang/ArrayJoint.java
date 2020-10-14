package cn.com.lang;

public class ArrayJoint {

	public static void main(String[] args) {
		String s = "abc";
		s += "def";
		
		StringBuffer s1 = new StringBuffer();
		System.out.println(s.getClass());
		System.out.println(s1.getClass());
		
		System.out.println(s == "abcdef");
	}
	
}

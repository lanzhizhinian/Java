package cn.com.lang;

public class Demo1 {

	public static void main(String[] args) {
		//int
		int a = 10;
		Integer a1 = intToInteger(a);
		String a2 = intToString(a);
		System.out.println("------int------");
		System.out.println(a1.getClass()+"\t"+a1);
		System.out.println(a2.getClass()+"\t"+a2);
		
		//Integer
		Integer b = 100;
		int b1 = integerToInt(b);
		String b2 = integerToString(b);
		System.out.println("------Integer------");
		System.out.println(b1);
		System.out.println(b2.getClass()+"\t"+b2);
		
		
		//String
		String c = "1000";
		int c1 = stringToInt(c);
		Integer c2 = stringToInteger(c);
		System.out.println("------String------");
		System.out.println(c1);
		System.out.println(c2.getClass()+"\t"+c2);
		
		Boolean d = new Boolean("false");
		System.out.println(d.hashCode());
		
		Byte e = new Byte("67");
		System.out.println(e.hashCode());
		
		Double f = new Double(12.4);
		double g = Double.doubleToLongBits(f);
		System.out.println(g);
		
	}
	
	//int
	public static Integer intToInteger(int a) {
		return Integer.valueOf(a);
	}
	public static String intToString(int a) {
		//return String.valueOf(a);
		return a+"";
	}
	
	
	//Integer
	public static int integerToInt(Integer b) {
		return b.intValue();
	}
	public static String integerToString(Integer b) {
		//return String.valueOf(b);
		return b+"";
	}
	
	
	//String
	public static int stringToInt(String c) {
		return Integer.parseInt(c);
	}
	public static Integer stringToInteger(String c) {
		return Integer.valueOf(c);
	}
}

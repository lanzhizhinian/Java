package day7_30;

public class Demo1 {

	public static void main(String[] args) {
		
		String s = "fgsdfdsjshgsj";
		String b = "   hgf hguf    ";
		String c = "FHHSDjofod";
		
		char a = s.charAt(0);
		System.out.println(a);
		String s1 = s.substring(3);
		System.out.println("s1£º   "+s1);
		String s2 = s.substring(4, 8);
		System.out.println("s2£º   "+s2);
		String s3 = s2.concat("fghd");
		System.out.println("s3£º   "+s3);
		String s4 = s.replace("s","a");
		System.out.println("s£º    "+s);
		System.out.println("s4£º   "+s4);
		String s9 = s.replaceAll("s", "m");
		System.out.println("s£º    "+s);
		System.out.println("s9£º   "+s9);
		String s5 = b.trim();
		System.out.println(s5);
		String s6 = s.toUpperCase();
		System.out.println(s6);
		String s7 = c.toLowerCase();
		System.out.println(s7);
		
		byte[] d = s.getBytes();
		for(int i = 0;i < d.length;i++) {
			System.out.print(d[i]+"  ");
		}
		System.out.println();
		
		char[] e = s.toCharArray();
		for(int i = 0;i < e.length;i++) {
			System.out.print(e[i]+"  ");
		}
		
		System.out.println();
		
		Student student = new Student();
		
		System.out.println(Integer.toHexString(student.hashCode()));
		
	}
	
}

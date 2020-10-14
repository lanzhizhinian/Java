package cn.com.list;

import java.util.Enumeration;
import java.util.Vector;

public class ColorTest {

	public static void main(String[] args) {
		String[] a = new String[] {"aaa","bbb","ccc","ddd"};
		
		Color color = new Color(a);
		while(color.hasMoreElements()) {
			System.out.println(color.nextElement());
		}
		
		Color1 c1 = Color1.BLUE;
		System.out.println("c1£º\t"+c1);
		
		System.out.println();
		
		Vector<String> v = new Vector<String>();
		v.add("aaa");
		v.add("bbb");
		v.add("ccc");
		v.add("ddd");
		for(Enumeration<String> e = v.elements();e.hasMoreElements();) {
			System.out.println(e.nextElement());
		}
		
	}
	
}

package cn.com.stringbuffer;

import java.io.PrintStream;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		
		PrintStream out = System.out;
		
		StringBuffer strbuf = new StringBuffer();
		strbuf.append("abcdefg");
		out.println(strbuf.toString());
		strbuf.append("bndfjknxºÍ´ó¼Ò");
		out.println(strbuf.toString());
		out.write(23);
		
	}

}

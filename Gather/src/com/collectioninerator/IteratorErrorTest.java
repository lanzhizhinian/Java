package com.collectioninerator;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorErrorTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ctrl+Q快速定位到最后一次修改的代码
		
		//问，怎么在foreach循环中删除元素？
		
		Collection books = new HashSet();
		books.add("Java EE企业应用实战");
		books.add("疯狂的Java");
		books.add("疯狂的android");
		
		Iterator it = books.iterator();
		for(Object obj:books) {
			String book = (String)it.next();
			System.out.println(book);
			if(book.equals("疯狂的Java")) {
				books.remove(book);
			}
			book = "测试字符串";
		}
	}

}

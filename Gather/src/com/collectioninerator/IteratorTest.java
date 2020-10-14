package com.collectioninerator;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection books = new HashSet();
		books.add("Java EE企业应用实战");
		books.add("疯狂的Java");
		books.add("疯狂的android");
		
		Iterator it = books.iterator();
		while(it.hasNext()) {
			String book = (String)it.next();
			System.out.println(book);
			if(book.equals("疯狂的Java")) {
				it.remove();
			}
			book = "测试字符串";
		}
		System.out.println(books);
	}

}

package com.collectioninerator;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection books = new HashSet();
		books.add("Java EE��ҵӦ��ʵս");
		books.add("����Java");
		books.add("����android");
		
		Iterator it = books.iterator();
		while(it.hasNext()) {
			String book = (String)it.next();
			System.out.println(book);
			if(book.equals("����Java")) {
				it.remove();
			}
			book = "�����ַ���";
		}
		System.out.println(books);
	}

}

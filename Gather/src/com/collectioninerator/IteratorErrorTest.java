package com.collectioninerator;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorErrorTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ctrl+Q���ٶ�λ�����һ���޸ĵĴ���
		
		//�ʣ���ô��foreachѭ����ɾ��Ԫ�أ�
		
		Collection books = new HashSet();
		books.add("Java EE��ҵӦ��ʵս");
		books.add("����Java");
		books.add("����android");
		
		Iterator it = books.iterator();
		for(Object obj:books) {
			String book = (String)it.next();
			System.out.println(book);
			if(book.equals("����Java")) {
				books.remove(book);
			}
			book = "�����ַ���";
		}
	}

}

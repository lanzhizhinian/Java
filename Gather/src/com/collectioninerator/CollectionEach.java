package com.collectioninerator;

import java.util.Collection;
import java.util.HashSet;

public class CollectionEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection books = new HashSet();
		books.add("Java EE��ҵӦ��ʵս");
		books.add("����Java");
		books.add("����android");
		
		books.forEach(obj->System.out.println("��������Ԫ��"+obj));
	}

}

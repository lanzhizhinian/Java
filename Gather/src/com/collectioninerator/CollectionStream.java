package com.collectioninerator;

import java.util.Collection;
import java.util.HashSet;

public class CollectionStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection books = new HashSet();
		books.add("Java EE��ҵӦ��ʵս");
		books.add("����java");
		books.add("����ios");
		books.add("���Ajax����");
		
		books.add("���Android����");
		
		System.out.println(books.stream().filter(ele->((String)ele).contains("���")).count());
		System.out.println(books.stream().filter(ele->((String)ele).contains("Java")).count());
		System.out.println(books.stream().filter(ele->((String)ele).length() > 10).count());
		books.stream().mapToInt(ele->((String)ele).length()).forEach(System.out::println);
	}

}

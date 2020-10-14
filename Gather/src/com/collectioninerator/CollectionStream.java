package com.collectioninerator;

import java.util.Collection;
import java.util.HashSet;

public class CollectionStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection books = new HashSet();
		books.add("Java EE企业应用实战");
		books.add("疯狂的java");
		books.add("疯狂的ios");
		books.add("疯狂Ajax讲义");
		
		books.add("疯狂Android讲义");
		
		System.out.println(books.stream().filter(ele->((String)ele).contains("疯狂")).count());
		System.out.println(books.stream().filter(ele->((String)ele).contains("Java")).count());
		System.out.println(books.stream().filter(ele->((String)ele).length() > 10).count());
		books.stream().mapToInt(ele->((String)ele).length()).forEach(System.out::println);
	}

}

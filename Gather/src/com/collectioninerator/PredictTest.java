package com.collectioninerator;

import java.util.Collection;
import java.util.HashSet;

public class PredictTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection books = new HashSet();
		books.add("Java EE企业应用实战");
		books.add("疯狂的java");
		books.add("疯狂的ios");
		books.add("疯狂Ajax讲义");
		
		books.add("疯狂Android讲义");
		books.removeIf(ele->((String)ele).length() < 10);
		System.out.println(books);
	}

}

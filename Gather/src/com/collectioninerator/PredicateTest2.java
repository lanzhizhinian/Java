package com.collectioninerator;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

public class PredicateTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection books = new HashSet();
		books.add("java EE企业应用实战");
		books.add("疯狂的java");
		books.add("疯狂的ios");
		books.add("疯狂Ajax讲义");
		
		books.add("疯狂Android讲义");
		System.out.println(calAll(books,ele->((String)ele).contains("疯狂")));
		System.out.println(calAll(books,ele->((String)ele).contains("java")));
		System.out.println(calAll(books,ele->((String)ele).length() > 10));
	}
	
	public static int calAll(Collection books,Predicate p) {
		int total = 0;
		for(Object obj:books) {
			if(p.test(obj)) {
				total++;	
			}
		}
		
		return total;
	}

}

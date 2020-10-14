package com.collectioninerator;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

public class PredicateTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection books = new HashSet();
		books.add("java EE��ҵӦ��ʵս");
		books.add("����java");
		books.add("����ios");
		books.add("���Ajax����");
		
		books.add("���Android����");
		System.out.println(calAll(books,ele->((String)ele).contains("���")));
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

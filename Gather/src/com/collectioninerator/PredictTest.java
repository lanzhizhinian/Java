package com.collectioninerator;

import java.util.Collection;
import java.util.HashSet;

public class PredictTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection books = new HashSet();
		books.add("Java EE��ҵӦ��ʵս");
		books.add("����java");
		books.add("����ios");
		books.add("���Ajax����");
		
		books.add("���Android����");
		books.removeIf(ele->((String)ele).length() < 10);
		System.out.println(books);
	}

}

package com.List;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List books = new ArrayList();
		books.add("������Java EE��ҵӦ��ʵս");
		books.add("����Java����");
		books.add("����android����");
		System.out.println(books);
		
		books.add(1,new String("���Aiax����"));
		for(int i = 0;i < books.size();i++) {
			System.out.println(books.get(i));
		}
		books.remove(2);
		System.out.println(books);
		
		System.out.println(books.indexOf(new String("����Ajax����")));
		books.set(1, "���Java����");
		System.out.println(books);
		System.out.println(books.subList(1, 2));
	}

}

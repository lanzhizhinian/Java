package com.List;

import java.util.ArrayList;
import java.util.List;

public class ListTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List books = new ArrayList();
		books.add("������Java EE��ҵӦ��ʵս");
		books.add("����Java����");
		books.add("����android����");
		books.add("���ios����");
		
		books.sort((o1,o2) -> ((String)o1).length() - ((String)o2).length());
		System.out.println(books);
		
		books.replaceAll(ele -> ((String)ele).length());
		System.out.println(books);
	}

}

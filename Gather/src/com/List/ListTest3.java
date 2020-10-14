package com.List;

import java.util.ArrayList;
import java.util.List;

public class ListTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List books = new ArrayList();
		books.add("轻量级Java EE企业应用实战");
		books.add("疯狂的Java讲义");
		books.add("疯狂的android讲义");
		books.add("疯狂ios讲义");
		
		books.sort((o1,o2) -> ((String)o1).length() - ((String)o2).length());
		System.out.println(books);
		
		books.replaceAll(ele -> ((String)ele).length());
		System.out.println(books);
	}

}

package com.collectioninerator;

import java.util.Collection;
import java.util.HashSet;

public class CollectionEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection books = new HashSet();
		books.add("Java EE企业应用实战");
		books.add("疯狂的Java");
		books.add("疯狂的android");
		
		books.forEach(obj->System.out.println("迭代集合元素"+obj));
	}

}

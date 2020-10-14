package com.collectioninerator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();
		c.add("孙悟空");
		c.add(6);
		System.out.println("集合c里的元素个数为："+c.size());
		
		c.remove(6);
		System.out.println("集合c里的元素个数为："+c.size());
		System.out.println("集合c里是否包含\"孙悟空\"字符串"+c.contains("孙悟空"));
		c.add("轻量级Java EE企业应用实践");
		System.out.println("集合c中包含元素："+c);
		Collection books = new HashSet();
		
		books.add("轻量级Java EE企业应用实践");
		books.add("疯狂的Java");
		System.out.println("集合c是否包含集合books："+c.containsAll(books));
		
		c.removeAll(books);
		System.out.println("集合c中的元素为"+c);
		c.clear();
		System.out.println("集合c中所有的元素为："+c);
		
		books.retainAll(c);
		System.out.println("集合books中的元素为"+books);
	}

}

package com.collectioninerator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();
		c.add("�����");
		c.add(6);
		System.out.println("����c���Ԫ�ظ���Ϊ��"+c.size());
		
		c.remove(6);
		System.out.println("����c���Ԫ�ظ���Ϊ��"+c.size());
		System.out.println("����c���Ƿ����\"�����\"�ַ���"+c.contains("�����"));
		c.add("������Java EE��ҵӦ��ʵ��");
		System.out.println("����c�а���Ԫ�أ�"+c);
		Collection books = new HashSet();
		
		books.add("������Java EE��ҵӦ��ʵ��");
		books.add("����Java");
		System.out.println("����c�Ƿ��������books��"+c.containsAll(books));
		
		c.removeAll(books);
		System.out.println("����c�е�Ԫ��Ϊ"+c);
		c.clear();
		System.out.println("����c�����е�Ԫ��Ϊ��"+c);
		
		books.retainAll(c);
		System.out.println("����books�е�Ԫ��Ϊ"+books);
	}

}

package com.queue;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList books = new LinkedList();
		books.offer("���Java����");
		books.push("������Java EE��ҵӦ��ʵս");
		books.offerFirst("���android����");
		
		for(int i = 0;i < books.size();i++) {
			System.out.println("������"+books.get(i));
		}
		System.out.println(books.peekFirst());
		System.out.println(books.peekLast());
		System.out.println(books.pop());
		
		System.out.println(books);
		System.out.println(books.pollLast());
		System.out.println(books);
	}

}

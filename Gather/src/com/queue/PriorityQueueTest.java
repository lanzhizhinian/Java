package com.queue;

import java.util.ArrayDeque;

public class PriorityQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque queue = new ArrayDeque();
		queue.offer("����Java����");
		queue.offer("���android����");
		queue.offer("������Java EE��ҵӦ��ʵս");
		
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
		
		System.out.println(queue.poll());
		System.out.println(queue);
	}

}

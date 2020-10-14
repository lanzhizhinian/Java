package com.queue;

import java.util.ArrayDeque;

public class PriorityQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque queue = new ArrayDeque();
		queue.offer("疯狂的Java讲义");
		queue.offer("疯狂android讲义");
		queue.offer("轻量级Java EE企业应用实战");
		
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
		
		System.out.println(queue.poll());
		System.out.println(queue);
	}

}

package com.collectioninerator;

import java.util.stream.IntStream;

public class IntStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream is = IntStream.builder()
				.add(20)
				.add(13)
				.add(-2)
				.add(0)
				.build();
		/*
		 * 以下方法一次只能执行一次
		 */
		System.out.println("所有元素的最大值为："+is.max().getAsInt());
		System.out.println("所有元素中的最小值为："+is.min().getAsInt());
		System.out.println("所有元素的总和："+is.sum());
		System.out.println("所有元素的总数："+is.count());
		System.out.println("所有元素的平均值："+is.average());
		System.out.println("is所有元素的平方是否都大于20"+is.allMatch(ele->ele*ele > 20));
		System.out.println("is是否包含任何元素的平方大于20"+is.anyMatch(ele->ele*ele > 20));
		IntStream newis = is.map(ele->ele*2+1);
		
		newis.forEach(System.out::println);
	}

}

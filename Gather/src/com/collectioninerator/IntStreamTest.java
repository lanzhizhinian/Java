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
		 * ���·���һ��ֻ��ִ��һ��
		 */
		System.out.println("����Ԫ�ص����ֵΪ��"+is.max().getAsInt());
		System.out.println("����Ԫ���е���СֵΪ��"+is.min().getAsInt());
		System.out.println("����Ԫ�ص��ܺͣ�"+is.sum());
		System.out.println("����Ԫ�ص�������"+is.count());
		System.out.println("����Ԫ�ص�ƽ��ֵ��"+is.average());
		System.out.println("is����Ԫ�ص�ƽ���Ƿ񶼴���20"+is.allMatch(ele->ele*ele > 20));
		System.out.println("is�Ƿ�����κ�Ԫ�ص�ƽ������20"+is.anyMatch(ele->ele*ele > 20));
		IntStream newis = is.map(ele->ele*2+1);
		
		newis.forEach(System.out::println);
	}

}

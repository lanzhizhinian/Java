package com.List;

import java.util.Arrays;
import java.util.List;

public class FixedSizeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List fixedList = Arrays.asList("���Java����","��������ҵӦ��ʵս");
		System.out.println(fixedList.getClass());
		fixedList.forEach(System.out::println);
		
		fixedList.add("���android����");
		fixedList.add("���Java����");
	}

}

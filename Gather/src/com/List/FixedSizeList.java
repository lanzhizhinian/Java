package com.List;

import java.util.Arrays;
import java.util.List;

public class FixedSizeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List fixedList = Arrays.asList("疯狂Java讲义","轻量级企业应用实战");
		System.out.println(fixedList.getClass());
		fixedList.forEach(System.out::println);
		
		fixedList.add("疯狂android讲义");
		fixedList.add("疯狂Java讲义");
	}

}

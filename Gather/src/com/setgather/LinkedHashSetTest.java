package com.setgather;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet hst = new LinkedHashSet();
		hst.add("����Java����");
		hst.add("������Java EE��ҵӦ�ÿ���");
		System.out.println(hst);
		
		hst.remove("����Java����");
		hst.add("android����");
		System.out.println(hst);
	}

}

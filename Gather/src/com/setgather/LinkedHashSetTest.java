package com.setgather;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet hst = new LinkedHashSet();
		hst.add("疯狂的Java讲义");
		hst.add("轻量级Java EE企业应用开发");
		System.out.println(hst);
		
		hst.remove("疯狂的Java讲义");
		hst.add("android讲义");
		System.out.println(hst);
	}

}

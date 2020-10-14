package com.setgather;

import java.util.TreeSet;

public class ZTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet st = new TreeSet();
		Z z = new Z(6);
		st.add(z);
		System.out.println(st.add(z));
		System.out.println(st);
		
		((Z)st.first()).age = 9;
		System.out.println(((Z)st.last()).age);
	}

}

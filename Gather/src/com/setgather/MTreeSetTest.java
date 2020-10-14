package com.setgather;

import java.util.TreeSet;

public class MTreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet((o1,o2)->{
			M m1 = (M)o1;
			M m2 = (M)o2;
			return m1.age > m2.age? -1:m1.age < m2.age?1:0;
		}) ;
		
		ts.add(new M(5));
		ts.add(new M(9));
		ts.add(new M(-3));
		System.out.println(ts);
	}

}

package com.setgather;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		hs.add(new R(9));
		hs.add(new R(-3));
		hs.add(new R(1));
		hs.add(new R(-5));
		
		Iterator it = hs.iterator();
		R first = (R)it.next();
		
		first.count = -3;
		System.out.println(hs);
		hs.remove(new R(-3));
		System.out.println(hs);
		
		System.out.println("hs�Ƿ����R.count = -3��R����?"+hs.contains(new R(-3)));
		System.out.println("hs�Ƿ����R.count = -2��R����?"+hs.contains(new R(-2)));
	}

}

package cn.com.list;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.Vector;

public class VectorTest{

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("aaa");
		v.add("bbb");
		v.add("ccc");
		v.add("ddd");

		for(String s:v) {
			System.out.println(s);
		}
		
		HashMap<Object,String> hashmap = new HashMap<Object,String>();
		hashmap.put("名称", "黄鹏飞");
		hashmap.put("学校", "湖南理工学院");
		hashmap.put("啦啦", "哈哈");
		
		Set<Object> set = hashmap.keySet();
		keySet(set);
		
		System.out.println();
		
		Collection<String> col = hashmap.values();
		valueCollection(col);
		
	}
	
	private static void keySet(Set<Object> set) {
		Iterator it = set.iterator();
		System.out.println("键值集合如下：");
		while(it.hasNext()) {
			Object temp = it.next();
			System.out.print(temp+"\t");
		}
		System.out.println();
	}
	
	private static void valueCollection(Collection<String> col) {
		System.out.println("值的集合如下：");
		for(String s : col) {
			System.out.print(s+"\t");
		}
		System.out.println();
	}
	
}

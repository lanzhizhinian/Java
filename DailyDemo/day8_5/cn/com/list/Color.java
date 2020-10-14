package cn.com.list;
import java.util.Enumeration;

public class Color<E> implements Enumeration<E>{
	
	private int index;
	private int size;
	
	private E[] array;
	
	public Color(E[] obj) {
		this.array = obj;
		this.size = obj.length;
	}


	@Override
	public boolean hasMoreElements() {
		return this.index < this.size?true:false;
	}
	
	@Override
	public E nextElement() {
		return array[index++];
	}
	
	
}

package cn.com.list;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<E> {

	/**
	 * 容量
	 */
	private int capcity;
	/**
	 * 增量
	 */
	private int growth;
	/**
	 * 索引
	 */
	private int index;
	
	
	private E[] array;
	
	public MyArrayList() {
		this.capcity = 5;
		this.growth = 5;
		array = (E[])new Object[this.capcity];
	}
	
	public MyArrayList(int initCapcity) {
		array = (E[]) new Object[initCapcity];
		this.capcity = initCapcity;
		this.setGrowth();
	}
	
	/**
	 * 用于返回对象数组的长度
	 * @return	-对象数组的长度
	 */
	public int size() {
		return this.index;
	}
	
	/**
	 * 用于设置增量
	 */
	private void setGrowth() {
		if(this.capcity >= 1000) {
			this.growth = this.capcity;
		}else {
			this.growth = 5;
		}
	}
	
	/**
	 * 用于判断对象数组是否为空
	 * @return	true-为空		false-不为空
	 */
	public boolean isEmpty() {
		return this.index == 0?true:false;
	}
	
	public boolean contains(Object o) {
		return false;
	}

	public boolean add(Object e) {
		boolean judge = false;
		if(index >= capcity) {
			this.setGrowth();
			E[] temp = (E[])new Object[this.capcity+this.growth];
			System.arraycopy(array, 0, temp, 0, array.length);
			array = temp;
			this.capcity += this.growth;
		}
		array[index] = (E) e;
		index++;
		return judge;
	}

	public void clear() {
		this.capcity = 5;
		this.growth = 5;
		this.index = 0;
		array = (E[]) new Object[this.capcity];
	}

	public E get(int index) {
		if(index < 0 || index >= this.index) {
			throw (new IndexOutOfBoundsException("Index："+index+"\t size"+this.index));
		}
		return array[index];
	}

	public Object set(int index, E element) {
		if(index < 1 || index > this.index) {
			throw (new IndexOutOfBoundsException("Index："+index+"\t size："+this.index));
		}
		E[] temp = (E[]) new Object[1];
		temp[0] = element;
		
		System.arraycopy(temp, 0, array, index-1, temp.length);
		return array[index-1];
	}

	public void add(int index, E element) {
		if(index < 1 || index > this.index) {
			throw (new IndexOutOfBoundsException("Index："+index+"\t size"+this.index));
		}
		if(index >= this.capcity) {
			this.setGrowth();
			E[] temp = (E[]) new Object[this.capcity+this.growth];
			System.arraycopy(array, 0, temp, 0, this.index);
			array = temp;
			this.capcity += this.growth;
		}
		System.arraycopy(array, index-1, array, index, this.index-index+1);
		this.set(index, element);
		this.index++;
	}

	
	public Object remove(int index) {
		if(index < 1 || index > this.index) {
			throw (new IndexOutOfBoundsException("Index："+index+"\t size："+this.index));
		}
		
		Object obj = new Object();
		
		if(this.index == 1) {
			this.index = 0;
			return obj;
		}
		
		if(index == this.index) {
			this.index -= 1;
			if(this.index == ((float)this.capcity)/2) {
				E[] temp = (E[]) new Object[this.capcity/2];
				System.arraycopy(array, 0, temp, 0, this.capcity/2);
				array = temp;
				this.capcity /= 2;
			}
			this.setGrowth();
			return obj;
		}
		
		if(index == 1) {
			this.index -= 1;
			if(this.index == ((float)this.capcity)/2) {
				E[] temp = (E[]) new Object[this.capcity/2];
				System.arraycopy(array, 1, temp, 0, this.index-1);
				array = temp;
				this.capcity /= 2;
			}else {
				System.arraycopy(array, 1, array, 0, this.index-1);
			}
			this.setGrowth();
			return obj;
		}
		
		this.index--;
		if(this.index == ((float)this.capcity)/2) {
			E[] temp = (E[]) new Object[this.capcity/2];
			System.arraycopy(array, 0, temp, 0, index-1);
			System.arraycopy(array, index+1, temp, index, temp.length-index);
			array = temp;
			this.capcity /= 2;
		}else {
			int temp = array.length;
			System.arraycopy(array, 0, array, 0, index-2);
			System.arraycopy(array, index, array, index-1, this.index-index+1);
		}
		this.setGrowth();
		return obj;
	}
	
 }

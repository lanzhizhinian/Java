package cn.com.homemade;
import java.util.Iterator;

public class MyArrayList<E> implements Iterator<E>{

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
	/**
	 * 用于iterator迭代器遍历的时候用来计数
	 */
	private int cindex;
	
	
	private E[] array;
	
	public MyArrayList() {
		this.capcity = 5;
		this.growth = 5;
		array = (E[])new Object[this.capcity];
	}
	
	public MyArrayList(MyArrayList mls) {
		this.growth = mls.getGrowth();
		this.capcity = mls.getCapcity();
		this.index = mls.size();
		array = (E[]) new Object[mls.capcity];
		System.arraycopy(mls.getArray(), 0, array, 0, mls.getArray().length);
	}
	
	public MyArrayList(int initCapcity) {
		array = (E[]) new Object[initCapcity];
		this.capcity = initCapcity;
		this.setGrowth();
	}
	
	
	
	public int getCapcity() {
		return capcity;
	}

	public int getGrowth() {
		return growth;
	}

	public E[] getArray() {
		return array;
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

	
	/**
	 * 用于往MyArrayList里添加元素
	 * @param e	-	待添加元素
	 * @return	ture-添加成功	false-添加失败
	 */
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

	
	/**
	 * 用于清空MyArrayList
	 */
	public void clear() {
		this.capcity = 5;
		this.growth = 5;
		this.index = 0;
		array = (E[]) new Object[this.capcity];
	}

	
	/**
	 * 根据索引获取元素
	 * @param index	-	想要获取的元素的索引
	 * @return	E	-	待取元素
	 */
	public E get(int index) {
		if(index < 0 || index > this.index) {
			throw (new IndexOutOfBoundsException("Index："+index+"\t size"+this.index));
		}
		return array[index-1];
	}

	
	/**
	 * 修改指定位置处的元素
	 * @param index	-	待修改元素在MyArrayList中的位置
	 * @param element	-	待修改的元素
	 * @return	-	返回修改成功的元素
	 */
	public Object set(int index, E element) {
		if(index < 1 || index > this.index) {
			throw (new IndexOutOfBoundsException("Index："+index+"\t size："+this.index));
		}
		E[] temp = (E[]) new Object[1];
		temp[0] = element;
		
		System.arraycopy(temp, 0, array, index-1, temp.length);
		return array[index-1];
	}

	
	/**
	 * 往指定位置插入元素
	 * @param index	-	等待添加的元素在MyArrayList中的位置
	 * @param element	-	等待添加的元素
	 */
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

	
	/**
	 * 删除指定位置的元素
	 * @param index	-	待删元素的索引
	 * @return	-	目前暂时为摆设
	 */
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
	
	
	/**
	 * 删除尾部元素
	 */
	public void remove() {
		if(this.index < 1) {
			throw (new IndexOutOfBoundsException("已到迭代器尾部！"));
		}
		this.remove(cindex);
		this.cindex--;
	}

	@Override
	public boolean hasNext() {
		return this.cindex < index?true:false;
	}

	@Override
	public E next() {
		E temp = null;
		if(this.cindex<index) {
			cindex++;
			temp = this.get(cindex);
		}
		return temp;
	}
	
 }

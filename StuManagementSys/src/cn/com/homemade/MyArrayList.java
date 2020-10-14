package cn.com.homemade;
import java.util.Iterator;

public class MyArrayList<E> implements Iterator<E>{

	/**
	 * ����
	 */
	private int capcity;
	/**
	 * ����
	 */
	private int growth;
	/**
	 * ����
	 */
	private int index;
	/**
	 * ����iterator������������ʱ����������
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
	 * ���ڷ��ض�������ĳ���
	 * @return	-��������ĳ���
	 */
	public int size() {
		return this.index;
	}
	
	/**
	 * ������������
	 */
	private void setGrowth() {
		if(this.capcity >= 1000) {
			this.growth = this.capcity;
		}else {
			this.growth = 5;
		}
	}
	
	/**
	 * �����ж϶��������Ƿ�Ϊ��
	 * @return	true-Ϊ��		false-��Ϊ��
	 */
	public boolean isEmpty() {
		return this.index == 0?true:false;
	}
	
	public boolean contains(Object o) {
		return false;
	}

	
	/**
	 * ������MyArrayList�����Ԫ��
	 * @param e	-	�����Ԫ��
	 * @return	ture-��ӳɹ�	false-���ʧ��
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
	 * �������MyArrayList
	 */
	public void clear() {
		this.capcity = 5;
		this.growth = 5;
		this.index = 0;
		array = (E[]) new Object[this.capcity];
	}

	
	/**
	 * ����������ȡԪ��
	 * @param index	-	��Ҫ��ȡ��Ԫ�ص�����
	 * @return	E	-	��ȡԪ��
	 */
	public E get(int index) {
		if(index < 0 || index > this.index) {
			throw (new IndexOutOfBoundsException("Index��"+index+"\t size"+this.index));
		}
		return array[index-1];
	}

	
	/**
	 * �޸�ָ��λ�ô���Ԫ��
	 * @param index	-	���޸�Ԫ����MyArrayList�е�λ��
	 * @param element	-	���޸ĵ�Ԫ��
	 * @return	-	�����޸ĳɹ���Ԫ��
	 */
	public Object set(int index, E element) {
		if(index < 1 || index > this.index) {
			throw (new IndexOutOfBoundsException("Index��"+index+"\t size��"+this.index));
		}
		E[] temp = (E[]) new Object[1];
		temp[0] = element;
		
		System.arraycopy(temp, 0, array, index-1, temp.length);
		return array[index-1];
	}

	
	/**
	 * ��ָ��λ�ò���Ԫ��
	 * @param index	-	�ȴ���ӵ�Ԫ����MyArrayList�е�λ��
	 * @param element	-	�ȴ���ӵ�Ԫ��
	 */
	public void add(int index, E element) {
		if(index < 1 || index > this.index) {
			throw (new IndexOutOfBoundsException("Index��"+index+"\t size"+this.index));
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
	 * ɾ��ָ��λ�õ�Ԫ��
	 * @param index	-	��ɾԪ�ص�����
	 * @return	-	Ŀǰ��ʱΪ����
	 */
	public Object remove(int index) {
		if(index < 1 || index > this.index) {
			throw (new IndexOutOfBoundsException("Index��"+index+"\t size��"+this.index));
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
	 * ɾ��β��Ԫ��
	 */
	public void remove() {
		if(this.index < 1) {
			throw (new IndexOutOfBoundsException("�ѵ�������β����"));
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

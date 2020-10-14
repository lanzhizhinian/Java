package cn.com;

public class Test<E,T extends E> {

	private E test1;
	private T test2;

	public T getTest2() {
		return test2;
	}

	public void setTest2(T test2) {
		this.test2 = test2;
	}

	public E getTest1() {
		return test1;
	}

	public void setTest1(E test) {
		this.test1 = test;
	}
	
	
	
}

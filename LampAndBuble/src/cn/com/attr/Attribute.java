package cn.com.attr;

public class Attribute<E,T> {

	private E attsName;
	private T attsValue;
	
	public Attribute(E attsName, T attsValue) {
		this.attsName = attsName;
		this.attsValue = attsValue;
	}
	
	public E getAttsName() {
		return attsName;
	}
	public void setAttsName(E attsName) {
		this.attsName = attsName;
	}
	public T getAttsValue() {
		return attsValue;
	}
	public void setAttsValue(T attsValue) {
		this.attsValue = attsValue;
	}
}

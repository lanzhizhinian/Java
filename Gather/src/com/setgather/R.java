package com.setgather;

public class R {
	int count;
	public R(int count) {
		this.count = count;
	}
	public String toString() {
		return "R[count"+this.count+"]";
	}
	public boolean equals(Object obj) {
		if(obj == this) {
			return true;
		}
		if(obj != null && obj.getClass() == R.class) {
			R r = (R)obj;
			return this.count == r.count;
		}
		return false;
	}
	
	public int hashCode() {
		return this.count;
	}
}

package cn.com.computer.beans;

import cn.com.classpackage.Computer;

public class DBUtil {

	private static int index;
	private static Computer[] computerArray;
	
	private DBUtil() {
		;
	}
	
	public static int getIndex() {
		return index;
	}
	public static void setIndex(int size) {
		index = size;
	}
	public static void initComputerArray(int size) {
		computerArray = new Computer[size];
	}
	public static Computer[] getComputerArray() {
		return computerArray;
	}
}

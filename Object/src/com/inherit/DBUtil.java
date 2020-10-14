package com.inherit;

public class DBUtil {

	private static Student[] studentInfo;
	private static int index;
	private int test;
	
	public DBUtil() {
		;
	}
	
	public static Student[] getStudentInfo() {
		return studentInfo;
	}
	public static void initStudentInfo(int size) {
		studentInfo = new Student[size];
	}
	
	public static int getIndex() {
		return index;
	}
	public static void setIndex(int size) {
		index = size;
	}
	
}

package cn.com.studentarray.db;

import cn.com.studentarray.bean.Student;

public class DBUtil {

	private static Student[] studentInfo;
	private static int index;
	
	private DBUtil() {
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

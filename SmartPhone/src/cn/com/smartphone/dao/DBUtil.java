package cn.com.smartphone.dao;

import cn.com.smartphone.smartphoneimpl.LowEndPhone;

public class DBUtil {

	private static LowEndPhone phone;
	
	private DBUtil() {
		
	}
		
	public static void setPhone(int size) {
		phone.setFunction(size);
	}
	
	public static void initPhone(LowEndPhone smartphone) {
		phone = smartphone;
	}
	
	public static LowEndPhone getPhone() {
		return phone;
	}
	
	public static boolean addFunction(String function) {
		boolean judge = false;
		String[] functions = phone.getFunctions();
		functions[phone.getIndex()] = function;
		phone.setIndex(phone.getIndex()+1);
		judge = true;
		return judge;
	}
	public static void show() {
		phone.showFunction();
	}
	
}

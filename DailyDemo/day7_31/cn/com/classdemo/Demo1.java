package cn.com.classdemo;

import java.util.Calendar;
import java.util.Date;

public class Demo1 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);

		Calendar cal = Calendar.getInstance();
		Calendar cal2 = (Calendar)cal.clone();
		System.out.println(cal == cal2);
	}
	
}

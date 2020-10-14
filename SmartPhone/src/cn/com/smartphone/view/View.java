package cn.com.smartphone.view;

import java.util.Scanner;
import cn.com.smartphone.dao.DBUtil;
import cn.com.smartphone.smartphoneimpl.HighEndPhone;
import cn.com.smartphone.smartphoneimpl.LowEndPhone;

public class View {

	private Scanner sc;
	private int functionNum;
	
	public View() {
		sc = new Scanner(System.in);
		init();
	}
	
	public void init() {
		System.out.println("请输入手机OTA增加的功能个数：");
		functionNum = sc.nextInt();
		while(functionNum < 1) {
			System.out.println("功能个数输入不合理，请重新输入一个大于等于1的数...");
			functionNum = sc.nextInt();
		}
		
		System.out.println("请依次输入  "+functionNum+"  个功能：");
		
		HighEndPhone phone = new HighEndPhone();
		DBUtil.initPhone(phone);
		DBUtil.setPhone(functionNum);
		String function = null;
		for(int i = 0;i < functionNum;i++) {
			System.out.println("第  "+(i+1)+" 个功能：");
			function = sc.next();
			DBUtil.addFunction(function);
		}
		
		DBUtil.show();
	}
	
}

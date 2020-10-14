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
		System.out.println("�������ֻ�OTA���ӵĹ��ܸ�����");
		functionNum = sc.nextInt();
		while(functionNum < 1) {
			System.out.println("���ܸ������벻��������������һ�����ڵ���1����...");
			functionNum = sc.nextInt();
		}
		
		System.out.println("����������  "+functionNum+"  �����ܣ�");
		
		HighEndPhone phone = new HighEndPhone();
		DBUtil.initPhone(phone);
		DBUtil.setPhone(functionNum);
		String function = null;
		for(int i = 0;i < functionNum;i++) {
			System.out.println("��  "+(i+1)+" �����ܣ�");
			function = sc.next();
			DBUtil.addFunction(function);
		}
		
		DBUtil.show();
	}
	
}

package cn.com.mailcheck.impl;
import java.util.Scanner;

import cn.com.mailcheck.inf.MailCheckInf;

public class MailCheck implements MailCheckInf {
	private Scanner sc;
	
	public MailCheck() {
		sc = new Scanner(System.in);
		init();
	}
	
	public void init() {
		System.out.println("请输入字符串：");
		String input = sc.next();
		if(!mailCheck(input)) {
			System.out.println("输入的邮箱格式不正确....");
		}else {
			System.out.println(input+"格式正确...");
		}
	}
	
	/* (non-Javadoc)
	 * @see cn.com.mailcheck.MailCheckInf#mailCheck(java.lang.String)
	 */
	@Override
	public boolean mailCheck(String Input) {
		if(!Input.contains("@") || !Input.contains(".")) {
			return false;
		}
		if(Input.indexOf("@", Input.indexOf("@")+1) != -1) {
			return false;
		}
		if(Math.abs(Input.indexOf("@")-Input.indexOf(".")) == 1) {
			return false;
		}
		if(Input.startsWith("@") || Input.endsWith("@") || Input.startsWith(".") || Input.endsWith(".")) {
			return false;
		}
		if(Input.indexOf("@") > Input.indexOf(".")) {
			return false;
		}
		
		return true;
		
	}
	
}

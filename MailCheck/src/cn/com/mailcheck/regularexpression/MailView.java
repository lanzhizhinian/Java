package cn.com.mailcheck.regularexpression;
import java.util.Scanner;

public class MailView {
	Scanner sc;
	private String input;
	
	public MailView() {
		sc = new Scanner(System.in);
		init();
	}
	
	public void init() {
		System.out.println("请输入您的邮箱："); 
		input = sc.next();
		
		boolean judge = MailCheckService.formatJudge(input);
		if(judge) {
			System.out.println("格式正确.....");
		}else {
			System.out.println("格式错误....");
		}
	}
	
}

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
		System.out.println("�������������䣺"); 
		input = sc.next();
		
		boolean judge = MailCheckService.formatJudge(input);
		if(judge) {
			System.out.println("��ʽ��ȷ.....");
		}else {
			System.out.println("��ʽ����....");
		}
	}
	
}

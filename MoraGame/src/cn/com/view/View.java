package cn.com.view;
import java.util.Scanner;
import cn.com.db.DBUtil;
import cn.com.service.Service;

public class View {

	private Scanner sc;
	private Service service;

	public View() {
		sc = new Scanner(System.in);
		service = new Service();
		init();
	}

	public void init() {
		System.out.println("************猜拳游戏开始************");
		System.out.println("1、表示石头");
		System.out.println("2、表示剪刀");
		System.out.println("3、 表示布");
		System.out.println("4、退出游戏");
		
		int num = 3;
		
		int cinput = service.getRandom(num);
		System.out.println("玩家请开始(输入4结束游戏)");

		int judge = 0;

		do{
			String pin = sc.next();
			int pinput = service.transFormat(pin);
			judge = service.validateByInput(pinput);
			if(judge == -1) {
				System.out.println("用户输入不合理，请重新输入...");
				continue;
			}else if(judge == 1) {
				cinput = service.getRandom(3);
				service.judge(cinput, pinput);
			}

		}while(judge != 0);
		
		int ctimes = DBUtil.getCtimes();
		int ptimes = DBUtil.getPtimes();
		
		System.out.println("游戏结束，本次猜拳游戏战况如下：");
		System.out.println("电脑获胜：\t"+DBUtil.getCtimes()+"\t次");
		System.out.println("玩家获胜：\t"+DBUtil.getPtimes()+"\t次");
		System.out.println("平局场次：\t"+DBUtil.getEqtimes()+"\t次");
	}

}

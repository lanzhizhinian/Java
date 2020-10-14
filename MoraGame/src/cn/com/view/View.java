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
		System.out.println("************��ȭ��Ϸ��ʼ************");
		System.out.println("1����ʾʯͷ");
		System.out.println("2����ʾ����");
		System.out.println("3�� ��ʾ��");
		System.out.println("4���˳���Ϸ");
		
		int num = 3;
		
		int cinput = service.getRandom(num);
		System.out.println("����뿪ʼ(����4������Ϸ)");

		int judge = 0;

		do{
			String pin = sc.next();
			int pinput = service.transFormat(pin);
			judge = service.validateByInput(pinput);
			if(judge == -1) {
				System.out.println("�û����벻��������������...");
				continue;
			}else if(judge == 1) {
				cinput = service.getRandom(3);
				service.judge(cinput, pinput);
			}

		}while(judge != 0);
		
		int ctimes = DBUtil.getCtimes();
		int ptimes = DBUtil.getPtimes();
		
		System.out.println("��Ϸ���������β�ȭ��Ϸս�����£�");
		System.out.println("���Ի�ʤ��\t"+DBUtil.getCtimes()+"\t��");
		System.out.println("��һ�ʤ��\t"+DBUtil.getPtimes()+"\t��");
		System.out.println("ƽ�ֳ��Σ�\t"+DBUtil.getEqtimes()+"\t��");
	}

}

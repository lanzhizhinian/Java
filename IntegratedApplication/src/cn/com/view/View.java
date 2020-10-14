package cn.com.view;

import java.io.PrintStream;
import cn.com.application.Myscanner;
import cn.com.service.impl.Service;

public class View {

	private static Service service;
	private static Myscanner sc;
	private static PrintStream out;
	
	static {
		out = System.out;
		sc = new Myscanner(System.in);
		service = new Service(sc,out);
		service.load();
	}
	
	public View() {
		init();
	}

	private void init() {
		while(true) {
			out.println("1������ѧ��\t 2��ɾ��ѧ��\t 3���޸�ѧ��\t 4����ӡѧ��\t 5������ѧ��\t 6������ѧ�����֤����\t 7���˳�ϵͳ");
			out.println("����������ѡ��");
			int choice = sc.nextInt();
			if(choice == 1) {
				if(service.addStu()) {
					out.println("���ѧ����Ϣ�ɹ���");
				}else {
					out.println("���ѧ����Ϣʧ�ܣ�");
				}
			}else if(choice == 2){
				out.println("1-��ѧ��ɾ\t 2-����ɾ");
				int tempchoice = sc.nextInt();
				if(tempchoice == 1) {
					if(service.delStuBystuNo()) {
						out.println("ɾ���ɹ���");
					}else {
						out.println("ɾ��ʧ�ܣ�");
					}
				}else if(tempchoice == 2) {
					if(service.delStuByKey()) {
						out.println("ɾ���ɹ���");
					}else {
						out.println("ɾ��ʧ�ܣ�");
					}
				}
			}else if(choice == 3) {
				if(service.updateStu()) {
					out.println("���³ɹ�");
				}else {
					out.println("����ʧ��");
				}
			}else if(choice == 4){
				service.printStu();
			}else if(choice == 5) {
				if(service.backup()) {
					out.println("���ݳɹ���");
				}else {
					out.println("����ʧ�ܣ�");
				}
			}else  if(choice == 6) {
				if(service.codeIdentify()) {
					out.println("���ܳɹ���");
				}else {
					out.println("����ʧ�ܣ�");
				}
			}else  if(choice == 7) {
				out.println("�˳�ѧ������ϵͳ��");
				break;
			}else {
				out.println("�����������������룡");
			}
		}
	}
	
}

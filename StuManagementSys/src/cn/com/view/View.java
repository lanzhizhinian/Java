package cn.com.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import cn.com.bean.StudentBean;
import cn.com.impl.service.Service;

public class View {

	private Scanner sc;
	private Service service;

	public View() {
		sc = new Scanner(System.in);
		service = new Service(sc);
		init();
	}

	public void init() {
		int choice = 0;
		try {
			String stuNo = null;
			String stuPassword = null;
			do {
				System.out.println("���¼....");
				System.out.println("�������˺�(ѧ��)��");
				stuNo = sc.next().trim();
				System.out.println("���������룺");
				stuPassword = sc.next().trim();
			} while (!service.loginValidate(stuNo, stuPassword));
			
			while (true) {

				System.out.println("--------------ѧ������ϵͳ--------------");
				System.out.println("1������ѧ�� \t 2��ɾ��ѧ�� \t3���޸�ѧ�� \t4����ѯѧ�� "
					+ "\t 5����ӡѧ����Ϣ \t 6������ \t 7�����ݱ��� 8���˳�");

				System.out.println("��������Ҫִ�еĹ���:");
				String temp;
				temp = sc.next();
				choice = service.transition(temp);

				if (choice == 8) {
					break;
				} else if (choice < 1 || choice > 9) {
					System.out.println("���벻��������������...");
					continue;
				}

				if (choice == 1) {
					System.out.println("*************����ѧ��*************");
					if (service.addStudent()) {
						System.out.println("ѧ����Ϣ��ӳɹ�");
					} else {
						System.out.println("ѧ����Ϣ���ʧ��");
					 }
				} else if (choice == 2) {
					System.out.println("*************ɾ��ѧ��*************");
					if (service.delStudent()) {
						System.out.println("ɾ��ѧ����Ϣ�ɹ�");
					} else {
						System.out.println("ɾ��ѧ����Ϣʧ��");
					}
				} else if (choice == 3) {
					System.out.println("*************�޸�ѧ����Ϣ*************");
					if (service.update()) {
						System.out.println("ѧ����Ϣ�޸ĳɹ�");
					} else {
						System.out.println("ѧ����Ϣ�޸�ʧ��");
					}
				} else if (choice == 4) {
					System.out.println("*************��ѯѧ����Ϣ*************");
					printStuInfo(service.searchStudent());
				} else if (choice == 5) {
					System.out.println("*************��ӡѧ����Ϣ*************");
					printStuInfo(service.getAllStuInfo());
				} else if (choice == 6) {
					System.out.println("*************����*************");
					ArrayList<StudentBean> list = (ArrayList<StudentBean>) service.getAllStuInfo();
					if (service.rank(list)) {
						System.out.println("�Ѱ�ѧ�Ŷ�ѧ���������,������£�");
						printStuInfo(list);
					} else {
						System.out.println("����ʧ��...");
					}
				} else if (choice == 7) {
					if(service.backup()) {
						System.out.println("���ݱ��ݳɹ���");
					}else {
						System.out.println("���ݱ���ʧ�ܣ�");
					}
				}

			}
		}finally {
			service.close();
		}

		System.out.println("�˳�ϵͳ���������....");

	}

	private void printStuInfo(List<StudentBean> list) {
		System.out.println("ѧ��\t ����\t ����\t �Ա�\t ��ͥסַ\t");
		for (int i = 0; i < list.size(); i++) {
			StudentBean student = list.get(i);
			System.out.println(student.getStuNo() + "\t" + student.getStuName() + "\t" + student.getAge() + "\t"
					+ student.getSex() + "\t" + student.getAddr() + "\t");
		}
	}

}

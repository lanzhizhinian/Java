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
				System.out.println("请登录....");
				System.out.println("请输入账号(学号)：");
				stuNo = sc.next().trim();
				System.out.println("请输入密码：");
				stuPassword = sc.next().trim();
			} while (!service.loginValidate(stuNo, stuPassword));
			
			while (true) {

				System.out.println("--------------学生管理系统--------------");
				System.out.println("1、新增学生 \t 2、删除学生 \t3、修改学生 \t4、查询学生 "
					+ "\t 5、打印学生信息 \t 6、排序 \t 7、数据备份 8、退出");

				System.out.println("请输入想要执行的功能:");
				String temp;
				temp = sc.next();
				choice = service.transition(temp);

				if (choice == 8) {
					break;
				} else if (choice < 1 || choice > 9) {
					System.out.println("输入不合理，请重新输入...");
					continue;
				}

				if (choice == 1) {
					System.out.println("*************新增学生*************");
					if (service.addStudent()) {
						System.out.println("学生信息添加成功");
					} else {
						System.out.println("学生信息添加失败");
					 }
				} else if (choice == 2) {
					System.out.println("*************删除学生*************");
					if (service.delStudent()) {
						System.out.println("删除学生信息成功");
					} else {
						System.out.println("删除学生信息失败");
					}
				} else if (choice == 3) {
					System.out.println("*************修改学生信息*************");
					if (service.update()) {
						System.out.println("学生信息修改成功");
					} else {
						System.out.println("学生信息修改失败");
					}
				} else if (choice == 4) {
					System.out.println("*************查询学生信息*************");
					printStuInfo(service.searchStudent());
				} else if (choice == 5) {
					System.out.println("*************打印学生信息*************");
					printStuInfo(service.getAllStuInfo());
				} else if (choice == 6) {
					System.out.println("*************排序*************");
					ArrayList<StudentBean> list = (ArrayList<StudentBean>) service.getAllStuInfo();
					if (service.rank(list)) {
						System.out.println("已按学号对学生排序完毕,结果如下：");
						printStuInfo(list);
					} else {
						System.out.println("排序失败...");
					}
				} else if (choice == 7) {
					if(service.backup()) {
						System.out.println("数据备份成功！");
					}else {
						System.out.println("数据备份失败！");
					}
				}

			}
		}finally {
			service.close();
		}

		System.out.println("退出系统，程序结束....");

	}

	private void printStuInfo(List<StudentBean> list) {
		System.out.println("学号\t 姓名\t 年龄\t 性别\t 家庭住址\t");
		for (int i = 0; i < list.size(); i++) {
			StudentBean student = list.get(i);
			System.out.println(student.getStuNo() + "\t" + student.getStuName() + "\t" + student.getAge() + "\t"
					+ student.getSex() + "\t" + student.getAddr() + "\t");
		}
	}

}

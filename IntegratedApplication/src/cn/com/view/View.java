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
			out.println("1、新增学生\t 2、删除学生\t 3、修改学生\t 4、打印学生\t 5、备份学生\t 6、加密学生身份证号码\t 7、退出系统");
			out.println("请输入您的选择：");
			int choice = sc.nextInt();
			if(choice == 1) {
				if(service.addStu()) {
					out.println("添加学生信息成功！");
				}else {
					out.println("添加学生信息失败！");
				}
			}else if(choice == 2){
				out.println("1-按学号删\t 2-按键删");
				int tempchoice = sc.nextInt();
				if(tempchoice == 1) {
					if(service.delStuBystuNo()) {
						out.println("删除成功！");
					}else {
						out.println("删除失败！");
					}
				}else if(tempchoice == 2) {
					if(service.delStuByKey()) {
						out.println("删除成功！");
					}else {
						out.println("删除失败！");
					}
				}
			}else if(choice == 3) {
				if(service.updateStu()) {
					out.println("更新成功");
				}else {
					out.println("更新失败");
				}
			}else if(choice == 4){
				service.printStu();
			}else if(choice == 5) {
				if(service.backup()) {
					out.println("备份成功！");
				}else {
					out.println("备份失败！");
				}
			}else  if(choice == 6) {
				if(service.codeIdentify()) {
					out.println("加密成功！");
				}else {
					out.println("加密失败！");
				}
			}else  if(choice == 7) {
				out.println("退出学生管理系统！");
				break;
			}else {
				out.println("输入有误，请重新输入！");
			}
		}
	}
	
}

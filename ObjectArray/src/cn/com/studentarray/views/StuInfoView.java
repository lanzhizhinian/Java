package cn.com.studentarray.views;

import java.util.Scanner;

import cn.com.studentarray.bean.Student;
import cn.com.studentarray.dao.StudentDao;
import cn.com.studentarray.service.ServiceStudent;
import cn.com.studentarray.validatestunum.ValidateStuNum;
public class StuInfoView {

	private Scanner sc;
	private ValidateStuNum validateStuNum;
	private ServiceStudent serviceStu;
	private StudentDao stuDao;
	
	public StuInfoView() {
		sc = new Scanner(System.in);
		serviceStu = new ServiceStudent();
		stuDao = new StudentDao();
		validateStuNum = new ValidateStuNum();
		
		init();
	}
	
	public void init() {
		System.out.println("请输入学生人数：");
		int stuNum = sc.nextInt();
		while(validateStuNum.validateStuNum(stuNum)) {
			System.out.println("人数输入有误，请重新输入...");
			stuNum = sc.nextInt();
		}
		
		stuDao.setStuInfoSize(stuNum);
		Student[] studentInfo = stuDao.showStudentInfo();
		Student s = null;
		for(int i = 0;i < studentInfo.length;i++) {
			System.out.println("请输入第 "+(i+1)+" 个学生的信息");
			
			System.out.println("请输入学号：");
			String stuNo = sc.next();
			if(stuDao.validateByStuNo(stuNo)) {
				i--;
				System.out.println("学号输入有误，请重新输入...");
				continue;
			}
			
			System.out.println("请输入姓名：");
			String name = sc.next();
			
			System.out.println("请输入地址：");
			String address = sc.next();
			
			System.out.println("请输入年龄：");
			int age = sc.nextInt();
			if(serviceStu.validateByAge(age)) {
				System.out.println("年龄输入有误，请重新输入：");
				i--;
				continue;
			}
			
			System.out.println("请输入性别：");
			char sex = sc.next().charAt(0);
			if(serviceStu.validateBySex(sex)) {
				System.out.println("性别输入有误，请重新输入...");
				i--;
				continue;
			}
			
			s = new Student();
			s.setName(name);
			s.setStuNo(stuNo);
			s.setAddress(address);
			s.setAge(age);
			s.setSex(sex);
			if(stuDao.addStudent(s)) {
				System.out.println("学生添加成功");
			}else {
				System.out.println("学生添加失败");
			}
		}
		printStuInfo(studentInfo);
	}

	private void printStuInfo(Student[] studentInfo) {
		System.out.println("姓名\t学号\t地址\t年龄\t性别\t");
		for(int i = 0;i < studentInfo.length;i++) {
			System.out.println(studentInfo[i].getName()+"\t"+studentInfo[i].getStuNo()+"\t"+
		studentInfo[i].getAddress()+"\t"+studentInfo[i].getAge()+"\t"+studentInfo[i].getSex());
		}
	}
}

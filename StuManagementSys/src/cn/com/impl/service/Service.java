package cn.com.impl.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import cn.com.bean.StudentBean;
import cn.com.impl.studaos.StuDao;
import cn.com.inf.ServiceInf;

public class Service implements ServiceInf {

	private String temp;
	private int choice;
	private Scanner sc;
	private StuDao stuDao;
	private MessageDigest md5;

	public Service(Scanner sc) {
		this.sc = sc;
		stuDao = new StuDao();
		try {
			md5 = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 将从键盘上获取的单个键值转换成int型数据
	 * 
	 * @param input - 输入的字符串
	 * @return int-转换后的数据
	 */
	public int transition(String input) {
		int result = -1;
		try {
			result = Integer.parseInt(input);
		} catch (NumberFormatException nfe) {
			;
		}
		return result;
	}

	/**
	 * 利用num1,num2来判断输入是否合理
	 * 
	 * @param num1 - 范围1
	 * @param num2 - 范围2
	 */
	private void judgement(int num1, int num2) {
		temp = sc.next();
		choice = this.transition(temp);
		while (choice < num1 || choice > num2) {
			System.out.println("输入不合理，请重新输入");
			temp = sc.next();
			choice = this.transition(temp);
		}

	}

	@Override
	public boolean validateByAge(int age) {
		boolean judge = false;
		if (age > 6 && age < 66) {
			judge = true;
		}
		return judge;
	}

	@Override
	public boolean addStudent() {
		boolean judge = false;
		System.out.println("请输入学生学号：");
		String stuNo = sc.next();
		if (stuDao.validateStuNo(stuNo)) {
			System.out.println("学号重复！");
			return judge;
		}
		StudentBean stu = input();
		if (stu == null) {
			return judge;
		}

		stu.setStuNo(stuNo);
		stuDao.addStudentDao(stu);

		judge = true;
		return judge;
	}

	@Override
	public boolean delStudent() {
		boolean judge = false;

		System.out.println("请输入您的选择：1-按学号删\t 2-按姓名删(模糊删除)");
		judgement(1, 2);
		if (choice == 1) {
			System.out.println("请输入学号：");
			String stuNo = sc.next();
			if (stuDao.validateStuNo(stuNo)) {
				stuDao.delStuByStuNoDao(stuNo);
				judge = true;
			} else {
				System.out.println("当前系统中并没有学号为：  " + stuNo + "  的学生");
			}
		} else {
			System.out.println("请输入姓名：");
			String stuName = sc.next();
			if (stuDao.delStuByNameDao(stuName)) {
				judge = true;
			}
		}

		return judge;
	}

	@Override
	public boolean update() {
		boolean judge = false;
		System.out.println("请输入学生学号：");
		String stuNo = sc.next();
		if (!stuDao.validateStuNo(stuNo)) {
			System.out.println("此管理系统中并没有学号为： " + stuNo + "  的学生");
			return judge;
		}

		StudentBean stu = input();
		if (stu != null) {
			stu.setStuNo(stuNo);
			stuDao.updateDao(stu);
			judge = true;
		}
		return judge;
	}

	@Override
	public List<StudentBean> searchStudent() {
		System.out.println("请输入您的选择：1-按学号查\t 2-按姓名查");
		judgement(1, 2);
		ArrayList<StudentBean> ls = new ArrayList<StudentBean>();
		if (choice == 1) {
			System.out.println("请输入学号：");
			String stuNo = sc.next();
			if (!stuDao.validateStuNo(stuNo)) {
				System.out.println("此管理系统中并没有学号为： " + stuNo + "  的学生");
				return ls;
			}
			ls = (ArrayList<StudentBean>) stuDao.searchStuByStuNoDao(stuNo);
		} else {
			System.out.println("请输入姓名：");
			String stuName = sc.next();
			ls = (ArrayList<StudentBean>) stuDao.searchByStuNameDao(stuName);
			if (ls.size() == 0) {
				System.out.println("当前系统中不存在姓名为：" + stuName + " 的学生");
			}

		}
		return ls;
	}

	@Override
	public boolean rank(List<StudentBean> list) {
		boolean judge = false;

		for (int i = 0; i < list.size()-1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).getStuNo().compareTo(list.get(j).getStuNo()) > 0) {
					StudentBean stu = list.get(i);
					list.set(i, list.get(j));
					list.set(j, stu);
				}
			}
		}

		judge = true;
		return judge;
	}

	@Override
	public List<StudentBean> getAllStuInfo() {
		return stuDao.getAllStudentInfoDao();
	}

	private StudentBean input() {
		System.out.println("请输入学生姓名：");
		String stuName = sc.next();
		
		System.out.println("请输入学生密码：");
		String stuPassword = sc.next();
		System.out.println("请输入学生年龄：");
		temp = sc.next();
		int age = this.transition(temp);
		if (!this.validateByAge(age)) {
			System.out.println("年龄输入不合理！");
			return null;
		}
		System.out.println("请输入学生性别：");
		char sex = sc.next().charAt(0);
		if (sex != '男' && sex != '女') {
			System.out.println("性别输入不合理！");
			return null;
		}
		System.out.println("请输入学生家庭住址：");
		String addr = sc.next();
		
		//加密
		byte[] data = md5.digest(stuPassword.getBytes());
		StudentBean stu = new StudentBean(null, this.code(data), stuName, age, sex, addr);

		return stu;
	}

	@Override
	public boolean backup() {
		boolean judge = false;
		File file = new File("backupData/backup.txt");
		if (!file.getParentFile().isDirectory()) {
			file.getParentFile().mkdirs();
		}
		BufferedWriter bw = null;

		try {
			bw = new BufferedWriter(new FileWriter(file, true));
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
			Date date = new Date(file.lastModified());
			bw.write("当前备份时间：" + sdf.format(date));
			bw.newLine();
			bw.write("学号\t\t+密码+\t\t姓名\t\t年龄\t性别\t家庭住址");
			bw.newLine();
			ArrayList<StudentBean> list = (ArrayList<StudentBean>) stuDao.getAllStudentInfoDao();
			for(int i = 0;i < list.size();i++) {
				bw.write(list.get(i).toString());
				bw.newLine();
			}
			bw.newLine();
			judge = true;
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		judge = true;
		return judge;
	}
	
	@Override
	public boolean loginValidate(String stuNo, String stuPassword) {
		byte[] data = md5.digest(stuPassword.getBytes());
		if(stuDao.loginIdentityDao(stuNo, this.code(data))) {
			return true;
		}
		return false;
	}
	
	/**
	 * 用于使密码等私人信息不可见
	 * @param data	被加密的数据
	 * @return	-	加密完成的数据
	 */
	private String code(byte[] data) {
		String codedata = new BigInteger(1,data).toString(16);
		//如果生成数字长度未满32位，前面补0
		for(int i = 0;i < 32-codedata.length();i++) {
			codedata = "0"+codedata;
		}
		return codedata;
	}
	
	public void close() {
		stuDao.closeDao();
	}

}

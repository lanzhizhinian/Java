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
	 * ���Ӽ����ϻ�ȡ�ĵ�����ֵת����int������
	 * 
	 * @param input - ������ַ���
	 * @return int-ת���������
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
	 * ����num1,num2���ж������Ƿ����
	 * 
	 * @param num1 - ��Χ1
	 * @param num2 - ��Χ2
	 */
	private void judgement(int num1, int num2) {
		temp = sc.next();
		choice = this.transition(temp);
		while (choice < num1 || choice > num2) {
			System.out.println("���벻��������������");
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
		System.out.println("������ѧ��ѧ�ţ�");
		String stuNo = sc.next();
		if (stuDao.validateStuNo(stuNo)) {
			System.out.println("ѧ���ظ���");
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

		System.out.println("����������ѡ��1-��ѧ��ɾ\t 2-������ɾ(ģ��ɾ��)");
		judgement(1, 2);
		if (choice == 1) {
			System.out.println("������ѧ�ţ�");
			String stuNo = sc.next();
			if (stuDao.validateStuNo(stuNo)) {
				stuDao.delStuByStuNoDao(stuNo);
				judge = true;
			} else {
				System.out.println("��ǰϵͳ�в�û��ѧ��Ϊ��  " + stuNo + "  ��ѧ��");
			}
		} else {
			System.out.println("������������");
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
		System.out.println("������ѧ��ѧ�ţ�");
		String stuNo = sc.next();
		if (!stuDao.validateStuNo(stuNo)) {
			System.out.println("�˹���ϵͳ�в�û��ѧ��Ϊ�� " + stuNo + "  ��ѧ��");
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
		System.out.println("����������ѡ��1-��ѧ�Ų�\t 2-��������");
		judgement(1, 2);
		ArrayList<StudentBean> ls = new ArrayList<StudentBean>();
		if (choice == 1) {
			System.out.println("������ѧ�ţ�");
			String stuNo = sc.next();
			if (!stuDao.validateStuNo(stuNo)) {
				System.out.println("�˹���ϵͳ�в�û��ѧ��Ϊ�� " + stuNo + "  ��ѧ��");
				return ls;
			}
			ls = (ArrayList<StudentBean>) stuDao.searchStuByStuNoDao(stuNo);
		} else {
			System.out.println("������������");
			String stuName = sc.next();
			ls = (ArrayList<StudentBean>) stuDao.searchByStuNameDao(stuName);
			if (ls.size() == 0) {
				System.out.println("��ǰϵͳ�в���������Ϊ��" + stuName + " ��ѧ��");
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
		System.out.println("������ѧ��������");
		String stuName = sc.next();
		
		System.out.println("������ѧ�����룺");
		String stuPassword = sc.next();
		System.out.println("������ѧ�����䣺");
		temp = sc.next();
		int age = this.transition(temp);
		if (!this.validateByAge(age)) {
			System.out.println("�������벻����");
			return null;
		}
		System.out.println("������ѧ���Ա�");
		char sex = sc.next().charAt(0);
		if (sex != '��' && sex != 'Ů') {
			System.out.println("�Ա����벻����");
			return null;
		}
		System.out.println("������ѧ����ͥסַ��");
		String addr = sc.next();
		
		//����
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
			bw.write("��ǰ����ʱ�䣺" + sdf.format(date));
			bw.newLine();
			bw.write("ѧ��\t\t+����+\t\t����\t\t����\t�Ա�\t��ͥסַ");
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
	 * ����ʹ�����˽����Ϣ���ɼ�
	 * @param data	�����ܵ�����
	 * @return	-	������ɵ�����
	 */
	private String code(byte[] data) {
		String codedata = new BigInteger(1,data).toString(16);
		//����������ֳ���δ��32λ��ǰ�油0
		for(int i = 0;i < 32-codedata.length();i++) {
			codedata = "0"+codedata;
		}
		return codedata;
	}
	
	public void close() {
		stuDao.closeDao();
	}

}

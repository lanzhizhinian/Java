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
		System.out.println("������ѧ��������");
		int stuNum = sc.nextInt();
		while(validateStuNum.validateStuNum(stuNum)) {
			System.out.println("����������������������...");
			stuNum = sc.nextInt();
		}
		
		stuDao.setStuInfoSize(stuNum);
		Student[] studentInfo = stuDao.showStudentInfo();
		Student s = null;
		for(int i = 0;i < studentInfo.length;i++) {
			System.out.println("������� "+(i+1)+" ��ѧ������Ϣ");
			
			System.out.println("������ѧ�ţ�");
			String stuNo = sc.next();
			if(stuDao.validateByStuNo(stuNo)) {
				i--;
				System.out.println("ѧ��������������������...");
				continue;
			}
			
			System.out.println("������������");
			String name = sc.next();
			
			System.out.println("�������ַ��");
			String address = sc.next();
			
			System.out.println("���������䣺");
			int age = sc.nextInt();
			if(serviceStu.validateByAge(age)) {
				System.out.println("���������������������룺");
				i--;
				continue;
			}
			
			System.out.println("�������Ա�");
			char sex = sc.next().charAt(0);
			if(serviceStu.validateBySex(sex)) {
				System.out.println("�Ա�������������������...");
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
				System.out.println("ѧ����ӳɹ�");
			}else {
				System.out.println("ѧ�����ʧ��");
			}
		}
		printStuInfo(studentInfo);
	}

	private void printStuInfo(Student[] studentInfo) {
		System.out.println("����\tѧ��\t��ַ\t����\t�Ա�\t");
		for(int i = 0;i < studentInfo.length;i++) {
			System.out.println(studentInfo[i].getName()+"\t"+studentInfo[i].getStuNo()+"\t"+
		studentInfo[i].getAddress()+"\t"+studentInfo[i].getAge()+"\t"+studentInfo[i].getSex());
		}
	}
}

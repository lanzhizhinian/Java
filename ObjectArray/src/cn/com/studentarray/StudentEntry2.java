package cn.com.studentarray;

import java.util.Scanner;

import cn.com.studentarray.bean.Student;

public class StudentEntry2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������¼���ѧ��������");
		int stuNum = sc.nextInt();
		while (stuNum < 1) {
			System.out.println("�����������󡤣�����������...");
			stuNum = sc.nextInt();
		}

		Student[] stuArray = new Student[stuNum];
		Student s = null;
		for (int i = 0; i < stuArray.length; i++) {
			System.out.println("�������  " + (i + 1) + "��ѧ������Ϣ��");
			System.out.println("������ѧ�ţ�");
			String stuNo = sc.next();
			boolean judge = true;
			for (int j = 0; j < i; j++) {
				if (stuNo.equals(stuArray[j].getStuNo())) {
					judge = false;
					break;
				}
			}
			if (!judge) {
				i--;
				System.out.println("ѧ�������ظ�������������...");
				continue;
			}

			System.out.println("������������");
			String name = sc.next();

			System.out.println("�������ַ��");
			String address = sc.next();

			System.out.println("���������䣺");
			int age = sc.nextInt();
			if (age < 6 || age > 60) {
				System.out.println("���������������������룺");
				i--;
				continue;
			}

			System.out.println("�������Ա�");
			char sex = sc.next().charAt(0);
			if (sex != '��' && sex != 'Ů') {
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
			stuArray[i] = s;
		}
		System.out.println("����\t" + "ѧ��\t" + "��ַ\t" + "����\t" + "�Ա�\t");
		for (int i = 0; i < stuArray.length; i++) {
			System.out.println(stuArray[i].getName() + "\t" + stuArray[i].getStuNo() + "\t" + stuArray[i].getAddress()
					+ "\t" + stuArray[i].getAge() + "\t" + stuArray[i].getSex());
		}
	}

}

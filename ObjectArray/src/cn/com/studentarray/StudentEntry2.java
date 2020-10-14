package cn.com.studentarray;

import java.util.Scanner;

import cn.com.studentarray.bean.Student;

public class StudentEntry2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入待录入的学生人数：");
		int stuNum = sc.nextInt();
		while (stuNum < 1) {
			System.out.println("数据输入有误·，请重新输入...");
			stuNum = sc.nextInt();
		}

		Student[] stuArray = new Student[stuNum];
		Student s = null;
		for (int i = 0; i < stuArray.length; i++) {
			System.out.println("请输入第  " + (i + 1) + "个学生的信息：");
			System.out.println("请输入学号：");
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
				System.out.println("学号输入重复，请重新输入...");
				continue;
			}

			System.out.println("请输入姓名：");
			String name = sc.next();

			System.out.println("请输入地址：");
			String address = sc.next();

			System.out.println("请输入年龄：");
			int age = sc.nextInt();
			if (age < 6 || age > 60) {
				System.out.println("年龄输入有误，请重新输入：");
				i--;
				continue;
			}

			System.out.println("请输入性别：");
			char sex = sc.next().charAt(0);
			if (sex != '男' && sex != '女') {
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
			stuArray[i] = s;
		}
		System.out.println("姓名\t" + "学号\t" + "地址\t" + "年龄\t" + "性别\t");
		for (int i = 0; i < stuArray.length; i++) {
			System.out.println(stuArray[i].getName() + "\t" + stuArray[i].getStuNo() + "\t" + stuArray[i].getAddress()
					+ "\t" + stuArray[i].getAge() + "\t" + stuArray[i].getSex());
		}
	}

}

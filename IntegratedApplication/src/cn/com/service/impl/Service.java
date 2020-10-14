package cn.com.service.impl;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import cn.com.application.Myscanner;
import cn.com.beans.Student;
import cn.com.daos.impl.StudentDao;
import cn.com.db.DBUtil;
import cn.com.service.Inf.ServiceInf;

public class Service implements ServiceInf {

	private File file;
	private Myscanner sc;
	private StudentDao stuDao;
	private PrintStream out;
	
	public Service(Myscanner sc,PrintStream out) {
		this.sc = sc;
		this.out = out;
		this.stuDao = new StudentDao();
	}
	
	@Override
	public boolean addStu() {
		boolean judge = false;
		
		out.println("������ѧ����Ϣ��");
		out.println("������ѧ�ţ�");
		String stuNo = sc.next();
		if(stuDao.stuNoExists(stuNo)) {
			out.println("ѧ���ظ�!");
			return judge;
		}
		
		Student stu = input();
		if(stu == null) {
			return judge;
		}
		stu.setStuNo(stuNo);
		
		if(stuDao.addStuDao(stu)) {
			judge = true;
		}
		return judge;
	}

	@Override
	public boolean backup() {
		boolean judge = false;
		HashMap<String,Student> stuMap = DBUtil.getAllStuInfo();
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(stuMap);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		judge = true;
		return judge;
	}

	@Override
	public boolean delStuBystuNo() {
		boolean judge = false;
		out.println("�������ɾѧ����ѧ�ţ�");
		String stuNo = sc.next();
		if(!stuDao.stuNoExists(stuNo)) {
			out.println("��ϵͳ��δ��¼ѧ��Ϊ:  "+stuNo+"  ��ѧ��������������");
			return judge;
		}
		if(stuDao.delStuBystuNoDao(stuNo)) {
			judge = true;
		}
		return judge;
	}

	@Override
	public boolean delStuByKey() {
		boolean judge = false;
		out.println("����������ɾ���Ĵ���ѧ���ļ�ֵ��");
		String no = sc.next();
		if(stuDao.delStuBystuKeyDao(no)) {
			judge = true;
		}
		return judge ;
	}

	@Override
	public boolean updateStu() {
		boolean judge = false;
		out.println("������ѧ��ѧ�ţ�");
		String stuNo = sc.next();
		if(stuDao.stuNoExists(stuNo)) {
			Student stu = input();
			if(stu != null) {
				stu.setStuNo(stuNo);
				stuDao.updateStuDao(stu);
				judge = true;
			}
		}else {
			out.println("ϵͳ������ѧ��Ϊ��  "+stuNo+"   ��ѧ����Ϣ");
		}
		return judge;
	}
	
	
	@Override
	public boolean load() {
		boolean judge = false;
		file = new File("data/student.txt");
		if(!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if(stuDao.loadDao(file)) {
			judge = true;
		}
		return judge;
	}
	

	@Override
	public void printStu() {
		HashMap<String,Student> stuMap = DBUtil.getAllStuInfo();
		Set<String> key = (Set<String>) stuMap.keySet();
		for(String temp:key) {
			out.println(temp+"\t"+stuMap.get(temp).toString());
		}
	}

	@Override
	public boolean validateAge(int age) {
		boolean judge = false;
		if(age > 6 && age < 66) {
			judge = true;
		}
		return judge;
	}
	
	@Override
	public boolean codeIdentify() {
		boolean judge = false;
		File file = new File("data/identify.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		out.println("1-����identify\t 2-��ȡidentify");
		int temp = sc.nextInt();
		DataOutputStream dos = null;
		DataInputStream dis = null;
		if(temp == 1) {
			try {
				dos = new DataOutputStream(new FileOutputStream(file));
				Collection<Student> list = DBUtil.getAllStuInfo().values();
				for(Student s:list) {
					dos.writeChars(s.getIdentity()+"");
				}
				judge = true;
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				if(dos != null) {
					try {
						dos.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}else if(temp == 2) {
			try {
				dis = new DataInputStream(new FileInputStream(file));
				String result = dis.readLine();
				out.println(result);
				judge = true;
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return judge;
	}

	/**
	 * ��������ѧ����ѧ���������Ϣ
	 * @return	-	Student �½���ѧ������
	 */
	private Student input() {
		System.out.println("���������䣺");
		int age = sc.nextInt();
		if(!this.validateAge(age)) {
			System.out.println("���䲻����");
			return null;
		}
		System.out.println("������ѧ�����֤��");
		long identity = sc.nextLong();
		System.out.println("������ѧ�����أ�");
		float weight = sc.nextFloat();
		if(weight < 5 || weight > 700) {
			System.out.println("�������벻����");
			return null;
		}
		
		Student stu = new Student();
		stu.setAge(age);
		stu.setIdentity(identity);
		stu.setWeight(weight);
		return stu;
	}

}

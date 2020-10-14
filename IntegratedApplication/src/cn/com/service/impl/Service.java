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
		
		out.println("请输入学生信息：");
		out.println("请输入学号：");
		String stuNo = sc.next();
		if(stuDao.stuNoExists(stuNo)) {
			out.println("学号重复!");
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
		out.println("请输入待删学生的学号：");
		String stuNo = sc.next();
		if(!stuDao.stuNoExists(stuNo)) {
			out.println("本系统中未收录学号为:  "+stuNo+"  的学生，返回主界面");
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
		out.println("请输入你想删除的代表学生的键值：");
		String no = sc.next();
		if(stuDao.delStuBystuKeyDao(no)) {
			judge = true;
		}
		return judge ;
	}

	@Override
	public boolean updateStu() {
		boolean judge = false;
		out.println("请输入学生学号：");
		String stuNo = sc.next();
		if(stuDao.stuNoExists(stuNo)) {
			Student stu = input();
			if(stu != null) {
				stu.setStuNo(stuNo);
				stuDao.updateStuDao(stu);
				judge = true;
			}
		}else {
			out.println("系统中尚无学号为：  "+stuNo+"   的学生信息");
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
		
		out.println("1-保存identify\t 2-读取identify");
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
	 * 用于输入学生除学号以外的信息
	 * @return	-	Student 新建的学生对象
	 */
	private Student input() {
		System.out.println("请输入年龄：");
		int age = sc.nextInt();
		if(!this.validateAge(age)) {
			System.out.println("年龄不合理！");
			return null;
		}
		System.out.println("请输入学生身份证：");
		long identity = sc.nextLong();
		System.out.println("请输入学生体重：");
		float weight = sc.nextFloat();
		if(weight < 5 || weight > 700) {
			System.out.println("体重输入不合理！");
			return null;
		}
		
		Student stu = new Student();
		stu.setAge(age);
		stu.setIdentity(identity);
		stu.setWeight(weight);
		return stu;
	}

}

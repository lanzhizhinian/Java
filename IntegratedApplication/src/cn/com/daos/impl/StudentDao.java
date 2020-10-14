package cn.com.daos.impl;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.HashMap;

import cn.com.beans.Student;
import cn.com.daos.inf.DaosInf;
import cn.com.db.DBUtil;

public class StudentDao implements DaosInf{
	
	@Override
	public boolean addStuDao(Student stu) {
		boolean judge = false;
		HashMap<String,Student> stuMap = DBUtil.getAllStuInfo();
		stuMap.put((stuMap.size()+1)+"", stu);
		judge = true;
		return judge;
	}

	@Override
	public boolean delStuBystuNoDao(String stuNo) {
		boolean judge = false;
		Collection<Student> stuCon = DBUtil.getAllStuInfo().values();
		for(Student student:stuCon) {
			if(student.getStuNo().equals(stuNo)) {
				stuCon.remove(student);
				judge = true;
				break;
			}
		}
		return judge;
	}

	@Override
	public boolean delStuBystuKeyDao(String key) {
		boolean judge = false;
		HashMap<String,Student> stuMap = DBUtil.getAllStuInfo();
		if(stuMap.remove(key) != null) {
			judge = true;
		}
		return judge;
	}

	@Override
	public boolean updateStuDao(Student stu) {
		boolean judge = false;
		Collection<Student> stuCon = DBUtil.getAllStuInfo().values();
		for(Student student:stuCon) {
			if(stu.getStuNo().equals(student.getStuNo())) {
				student.setAge(stu.getAge());
				student.setIdentity(stu.getIdentity());
				student.setWeight(stu.getWeight());
				judge = true;
				break;
			}
		}
		return judge;
	}
	
	@Override
	public boolean loadDao(File file) {
		boolean judge = false;
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(file));
			HashMap<String,Student> stuMap = (HashMap<String, Student>) ois.readObject();
			DBUtil.getAllStuInfo().putAll(stuMap);
		} catch (EOFException eof) {
			;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		judge = true;
		return judge;
	}


	@Override
	public boolean stuNoExists(String stuNo) {
		boolean judge = false;
		Collection<Student> stuCon = DBUtil.getAllStuInfo().values();
		for(Student student:stuCon) {
			if(stuNo.equals(student.getStuNo())) {
				judge = true;
				break;
			}
		}
		
		return judge;
	}

}

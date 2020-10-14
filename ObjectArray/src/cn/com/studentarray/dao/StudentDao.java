package cn.com.studentarray.dao;

import cn.com.studentarray.bean.Student;
import cn.com.studentarray.db.DBUtil;

public class StudentDao{
	
	public void setStuInfoSize(int size) {
		DBUtil.initStudentInfo(size);
	}
	
	public boolean addStudent(Student student) {
		boolean judge = false;
		Student[] studentInfo = DBUtil.getStudentInfo();
		studentInfo[DBUtil.getIndex()] = student;
		DBUtil.setIndex(DBUtil.getIndex()+1);
		judge = true;
		return judge;
	}
	
	public boolean validateByStuNo(String stuNo) {

		boolean judge = false;
		Student[] student = DBUtil.getStudentInfo();
		for(int i = 0;i < DBUtil.getIndex();i++) {
			if(student[i].getStuNo().equals(stuNo)) {
				judge = true;
				break;
			}
		}
		return judge;
	}
	
	public Student[] showStudentInfo() {
		return DBUtil.getStudentInfo();
	}
	
}

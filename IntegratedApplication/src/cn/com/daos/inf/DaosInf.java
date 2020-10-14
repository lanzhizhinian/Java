package cn.com.daos.inf;
import java.io.File;

import cn.com.beans.Student;

public interface DaosInf {

	/**
	 * 用于新增学生
	 * @param stu	-	待添加的学生
	 * @return	true - 添加成功	false - 添加失败
	 */
	public boolean addStuDao(Student stu);
	
	
	/**
	 * 用于按学号删除学生
	 * @param	stuNo - 学生学号
	 * @return	ture - 删除成功	false - 删除失败
	 */
	public boolean delStuBystuNoDao(String stuNo);
	
	
	/**
	 * 按键删除学生
	 * @param key	-	键
	 * @return	ture - 删除成功	false - 删除失败
	 */
	public boolean delStuBystuKeyDao(String key);
	
	
	/**
	 * 修改学生信息
	 * @param stu	-	待更新的学生
	 * @return	true - 学生信息修改成功	false - 学生信息修改失败
	 */
	public boolean updateStuDao(Student stu);
	
	
	/**
	 * 用于初始化系统时装载数据
	 * @param	file	-	存放文件的地方
	 * @return	true - 装载成功	false - 装载失败
	 */
	public boolean loadDao(File file);
	
	/**
	 * 校验学号是否重复
	 * @param stuNo	-	待校验的学号
	 * @return	true - 学号重复	false - 学号不重复
	 */
	public boolean stuNoExists(String stuNo);
	
}

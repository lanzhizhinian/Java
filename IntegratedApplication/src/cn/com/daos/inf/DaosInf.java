package cn.com.daos.inf;
import java.io.File;

import cn.com.beans.Student;

public interface DaosInf {

	/**
	 * ��������ѧ��
	 * @param stu	-	����ӵ�ѧ��
	 * @return	true - ��ӳɹ�	false - ���ʧ��
	 */
	public boolean addStuDao(Student stu);
	
	
	/**
	 * ���ڰ�ѧ��ɾ��ѧ��
	 * @param	stuNo - ѧ��ѧ��
	 * @return	ture - ɾ���ɹ�	false - ɾ��ʧ��
	 */
	public boolean delStuBystuNoDao(String stuNo);
	
	
	/**
	 * ����ɾ��ѧ��
	 * @param key	-	��
	 * @return	ture - ɾ���ɹ�	false - ɾ��ʧ��
	 */
	public boolean delStuBystuKeyDao(String key);
	
	
	/**
	 * �޸�ѧ����Ϣ
	 * @param stu	-	�����µ�ѧ��
	 * @return	true - ѧ����Ϣ�޸ĳɹ�	false - ѧ����Ϣ�޸�ʧ��
	 */
	public boolean updateStuDao(Student stu);
	
	
	/**
	 * ���ڳ�ʼ��ϵͳʱװ������
	 * @param	file	-	����ļ��ĵط�
	 * @return	true - װ�سɹ�	false - װ��ʧ��
	 */
	public boolean loadDao(File file);
	
	/**
	 * У��ѧ���Ƿ��ظ�
	 * @param stuNo	-	��У���ѧ��
	 * @return	true - ѧ���ظ�	false - ѧ�Ų��ظ�
	 */
	public boolean stuNoExists(String stuNo);
	
}

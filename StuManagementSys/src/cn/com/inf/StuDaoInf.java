package cn.com.inf;
import java.io.File;
import java.util.List;
import cn.com.bean.StudentBean;

/**
 * ��ѧ����Ϣ�����ز����Ľӿ�
 * @author yunsuowu
 *
 */
public interface StuDaoInf {

	/**
	 * ����У��ѧ���Ƿ��ظ�
	 * @param stuNo	-	��У���ѧѧ��
	 * @return	true-ѧ���ظ�	false-ѧ�Ų��ظ�
	 */
	boolean validateStuNo(String stuNo);
	
	
	/**
	 * ��������½ѧ������ϵͳ���˺�������֤
	 * @param stuNo		-		ѧ�ţ����˺�
	 * @param stuPassword	-	����
	 * @return	true - ��֤ͨ��	false - ��֤ʧ��
	 */
	boolean loginIdentityDao(String stuNo,String stuPassword);

	
	/**
	 * ������ѧ����������Ӷ���
	 * @param stu	-	����ӵ�ѧ������
	 * @return	true-��ӳɹ�	false-���ʧ��
	 */
	boolean addStudentDao(StudentBean stu);

	
	/**
	 * ����ͨ������ִ��ɾ��ѧ������
	 * @param stuName	-	ѧ��������
	 * @return	true-ɾ���ɹ�	false-ɾ��ʧ��
	 */
	boolean delStuByNameDao(String stuName);
	
	
	/**
	 * ����ͨ��ѧ��ɾ��ѧ��
	 * @param stuNo	-	ѧ����ѧ��
	 * @return	true-ɾ���ɹ�	false-ɾ��ʧ��
	 */
	boolean delStuByStuNoDao(String stuNo);
	
	
	/**
	 * �����޸�ѧ����Ϣ
	 * @param stu	-	���µ�ѧ����Ϣ
	 * @return	true-�޸ĳɹ�	false-�޸�ʧ��
	 */
	boolean updateDao(StudentBean stu);
	
	
	/**
	 * ͨ��������ȡѧ�����󼯺ϣ�����ִ�в�ѯѧ����Ϣ����
	 * @param info	-	ѧ��������
	 * @return	��ѯ��ѧ�����󼯺�
	 */
	List<StudentBean> searchByStuNameDao(String stuName);
	
	
	/**
	 * ��ȡͨ��ѧ�Ų�ѯ����ѧ����Ϣ
	 * @param stuNo	-	ѧ����ѧ��
	 * @return	��ѯ��ѧ������ʹ��List��Ϊ��ֻͨ��һ����ӡ�������ɴ�ӡ����/���ѧ����Ϣ
	 */
	List<StudentBean> searchStuByStuNoDao(String stuNo);
	
	
	/**
	 * ��ȡ���е�ѧ����Ϣ
	 * @return	���е�ѧ����Ϣ
	 */
	List<StudentBean> getAllStudentInfoDao();
	
	
	/**
	 * �����ж�ѧ���������Ƿ���ѧ��
	 * @return	true-û��	false-��
	 */
	boolean isEmpty();
	
}
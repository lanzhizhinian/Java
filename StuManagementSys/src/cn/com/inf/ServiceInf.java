package cn.com.inf;
import java.io.File;
import java.util.List;
import cn.com.bean.StudentBean;

/**
 * @author yunsuowu
 *
 */
public interface ServiceInf {

	/**
	 * У��������ѧ�������Ƿ����
	 * @param age	-	��У���ѧ������
	 * @return	true-�������	false-���䲻����
	 */
	boolean validateByAge(int age);

	/**
	 * ��������½ѧ������ϵͳ���˺�������֤
	 * @param stuNo		-		ѧ�ţ����˺�
	 * @param stuPassword	-	����
	 * @return	true - ��֤ͨ��	false - ��֤ʧ��
	 */
	boolean loginValidate(String stuNo,String stuPassword);
	
	/**
	 * �������ѧ����Ϣ
	 * @param stu	-	����ӵ�ѧ��
	 * @return	true-��ӳɹ�	false-���ʧ��
	 */
	boolean addStudent();
	
	
	/**
	 * ɾ��ѧ����Ϣ
	 * @param stuName	-	ѧ������
	 * @return	true-ɾ���ɹ�	false-ɾ��ʧ��
	 */
	boolean delStudent();
	
	
	/**
	 * ����ѧ����Ϣ(ѧ�ų���)
	 * @param stuNo	-	ѧ��ѧ��
	 * @return	true-���³ɹ�	false-����ʧ��
	 */
	boolean update();
	
	
	/**
	 * ��ѯѧ����Ϣ
	 * @return	����ѧ������
	 */
	List<StudentBean> searchStudent();
	
	
	/**
	 * ���ڶ�ѧ����������
	 * @param list	-	������ļ���
	 * @return	true-����ɹ�	false-����ʧ��
	 */
	boolean rank(List<StudentBean> list);
	
 
	/**
	 * ��ȡ����ѧ������Ϣ����
	 * @return
	 */
	List<StudentBean> getAllStuInfo();
	
	
	/**
	 * ���Ӽ����ϻ�ȡ�ĵ�����ֵת����int������
	 * @param input	-	������ַ���
	 * @return	int-ת���������
	 */
	int transition(String input);

	
	/**
	 * ���ڱ����ļ�
	 * @return	-	true - ���ݳɹ�	false - ����ʧ��
	 */
	boolean backup();
}
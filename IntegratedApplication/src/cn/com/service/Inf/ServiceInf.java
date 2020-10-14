package cn.com.service.Inf;

public interface ServiceInf {

	/**
	 * ���ѧ����Ϣ
	 * @return	true - �����ɹ�	false - ����ʧ��
	 */
	public boolean addStu();
	
	/**
	 * ����ѧ������
	 * @return	true - ���ݳɹ�	false - ����ʧ��
	 */
	public boolean backup();
	
	/**
	 * ���ڿ�������ѧ������ϵͳ�е�ѧ����Ϣ
	 * @return	true - װ�سɹ�	false - װ��ʧ��
	 */
	public boolean load();
	
	/**
	 * ���ڸ���ѧ��ɾ��ѧ��
	 * @return	true - ɾ���ɹ�	false - ɾ��ʧ��
	 */
	public boolean delStuBystuNo();
	
	/**
	 * ����ѧ���ļ�ɾ��ѧ��
	 * @return	true - ɾ���ɹ�	false - ɾ��ʧ��
	 */
	public boolean delStuByKey();
	
	/**
	 * ����ѧ����Ϣ
	 * @return	true - ���³ɹ�	false - ����ʧ��
	 */
	public boolean updateStu();
	
	/**
	 * ���ڽ�ѧ�����֤���Զ�������ʽ�����ļ���
	 * @return	true - ���ܳɹ�	false - ����ʧ��
	 */
	public boolean codeIdentify();
	
	/**
	 * ���ڴ�ӡȫ��ѧ������Ϣ
	 */
	public void printStu();
	
	/**
	 * ����У�������Ƿ�ϸ�
	 * @param age	-	����֤����
	 * @return	true - ����ϸ�	false - ���䲻�ϸ�
	 */
	public boolean validateAge(int age);
	
}

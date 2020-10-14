package cn.com.serviseinf;

public interface ServiceInf {
	
	int WIN = 1;
	int EQ = 0;
	int LOSE = -1;

	/**
	 * �ж�˭Ӯ
	 * @param num1 - ���Գ���
	 * @param num2 - ��ҳ���
	 * @void
	 */
	void judge(int num1, int num2);

	/**
	 * �ж������Ƿ����
	 * @param num-�û����������
	 * @return -1-���벻�Ϸ����������� 0-��Ϸ���� 1-����Ϸ�
	 */
	int validateByInput(int num);

	void transition(String identity, int num);

	/**
	 *  Ϊ�����û��������������룬���������쳣�׳����³������
	 * @param input-�û�������ַ���
	 * @return
	 */
	int transFormat(String input);
	
	/**
	 * ��ȡ0 - num-1��Χ�ڵ������
	 * @param num
	 * @return
	 */
	int getRandom(int num);

}
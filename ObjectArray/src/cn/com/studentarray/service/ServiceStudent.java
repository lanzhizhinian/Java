package cn.com.studentarray.service;

public class ServiceStudent {
	
	/**
	 * ��֤����
	 * @param age
	 * @return
	 */
	public boolean validateByAge(int age) {
		
		return age < 6 || age > 60 ? true:false;
		
	}
	
	/**
	 * ��֤�Ա�
	 * @param sex
	 * @return
	 */
	public boolean validateBySex(char sex) {

		return sex != '��'&&sex != 'Ů' ? true:false;
		
	}
}

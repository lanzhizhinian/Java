package cn.com.studentarray.service;

public class ServiceStudent {
	
	/**
	 * 验证年龄
	 * @param age
	 * @return
	 */
	public boolean validateByAge(int age) {
		
		return age < 6 || age > 60 ? true:false;
		
	}
	
	/**
	 * 验证性别
	 * @param sex
	 * @return
	 */
	public boolean validateBySex(char sex) {

		return sex != '男'&&sex != '女' ? true:false;
		
	}
}

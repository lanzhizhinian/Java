package cn.com.service.Inf;

public interface ServiceInf {

	/**
	 * 添加学生信息
	 * @return	true - 新增成功	false - 新增失败
	 */
	public boolean addStu();
	
	/**
	 * 备份学生数据
	 * @return	true - 备份成功	false - 备份失败
	 */
	public boolean backup();
	
	/**
	 * 用于开机加载学生管理系统中的学生信息
	 * @return	true - 装载成功	false - 装载失败
	 */
	public boolean load();
	
	/**
	 * 用于根据学号删除学生
	 * @return	true - 删除成功	false - 删除失败
	 */
	public boolean delStuBystuNo();
	
	/**
	 * 根据学生的键删除学生
	 * @return	true - 删除成功	false - 删除失败
	 */
	public boolean delStuByKey();
	
	/**
	 * 更新学生信息
	 * @return	true - 更新成功	false - 更新失败
	 */
	public boolean updateStu();
	
	/**
	 * 用于将学生身份证号以二进制形式存入文件中
	 * @return	true - 加密成功	false - 加密失败
	 */
	public boolean codeIdentify();
	
	/**
	 * 用于打印全体学生的信息
	 */
	public void printStu();
	
	/**
	 * 用于校验年龄是否合格
	 * @param age	-	待验证年龄
	 * @return	true - 年龄合格	false - 年龄不合格
	 */
	public boolean validateAge(int age);
	
}

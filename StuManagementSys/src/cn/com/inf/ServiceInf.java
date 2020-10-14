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
	 * 校验待输入的学生年龄是否合理
	 * @param age	-	待校验的学生年龄
	 * @return	true-年龄合理	false-年龄不合理
	 */
	boolean validateByAge(int age);

	/**
	 * 用于做登陆学生管理系统的账号密码验证
	 * @param stuNo		-		学号，即账号
	 * @param stuPassword	-	密码
	 * @return	true - 验证通过	false - 验证失败
	 */
	boolean loginValidate(String stuNo,String stuPassword);
	
	/**
	 * 用于添加学生信息
	 * @param stu	-	待添加的学生
	 * @return	true-添加成功	false-添加失败
	 */
	boolean addStudent();
	
	
	/**
	 * 删除学生信息
	 * @param stuName	-	学生姓名
	 * @return	true-删除成功	false-删除失败
	 */
	boolean delStudent();
	
	
	/**
	 * 更新学生信息(学号除外)
	 * @param stuNo	-	学生学号
	 * @return	true-更新成功	false-更新失败
	 */
	boolean update();
	
	
	/**
	 * 查询学生信息
	 * @return	待查学生集合
	 */
	List<StudentBean> searchStudent();
	
	
	/**
	 * 用于对学生集合排序
	 * @param list	-	待排序的集合
	 * @return	true-排序成功	false-排序失败
	 */
	boolean rank(List<StudentBean> list);
	
 
	/**
	 * 获取所有学生的信息集合
	 * @return
	 */
	List<StudentBean> getAllStuInfo();
	
	
	/**
	 * 将从键盘上获取的单个键值转换成int型数据
	 * @param input	-	输入的字符串
	 * @return	int-转换后的数据
	 */
	int transition(String input);

	
	/**
	 * 用于备份文件
	 * @return	-	true - 备份成功	false - 备份失败
	 */
	boolean backup();
}
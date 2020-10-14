package cn.com.inf;
import java.io.File;
import java.util.List;
import cn.com.bean.StudentBean;

/**
 * 对学生信息完成相关操作的接口
 * @author yunsuowu
 *
 */
public interface StuDaoInf {

	/**
	 * 用于校验学号是否重复
	 * @param stuNo	-	待校验的学学号
	 * @return	true-学号重复	false-学号不重复
	 */
	boolean validateStuNo(String stuNo);
	
	
	/**
	 * 用于做登陆学生管理系统的账号密码验证
	 * @param stuNo		-		学号，即账号
	 * @param stuPassword	-	密码
	 * @return	true - 验证通过	false - 验证失败
	 */
	boolean loginIdentityDao(String stuNo,String stuPassword);

	
	/**
	 * 用于往学生集合里添加对象
	 * @param stu	-	待添加的学生对象
	 * @return	true-添加成功	false-添加失败
	 */
	boolean addStudentDao(StudentBean stu);

	
	/**
	 * 用于通过姓名执行删除学生操作
	 * @param stuName	-	学生的姓名
	 * @return	true-删除成功	false-删除失败
	 */
	boolean delStuByNameDao(String stuName);
	
	
	/**
	 * 用于通过学号删除学生
	 * @param stuNo	-	学生的学号
	 * @return	true-删除成功	false-删除失败
	 */
	boolean delStuByStuNoDao(String stuNo);
	
	
	/**
	 * 用于修改学生信息
	 * @param stu	-	更新的学生信息
	 * @return	true-修改成功	false-修改失败
	 */
	boolean updateDao(StudentBean stu);
	
	
	/**
	 * 通过姓名获取学生对象集合，用于执行查询学生信息操作
	 * @param info	-	学生的姓名
	 * @return	查询的学生对象集合
	 */
	List<StudentBean> searchByStuNameDao(String stuName);
	
	
	/**
	 * 获取通过学号查询到的学生信息
	 * @param stuNo	-	学生的学号
	 * @return	查询的学生对象，使用List是为了只通过一个打印函数即可打印单个/多个学生信息
	 */
	List<StudentBean> searchStuByStuNoDao(String stuNo);
	
	
	/**
	 * 获取所有的学生信息
	 * @return	所有的学生信息
	 */
	List<StudentBean> getAllStudentInfoDao();
	
	
	/**
	 * 用于判断学生集合里是否有学生
	 * @return	true-没有	false-有
	 */
	boolean isEmpty();
	
}
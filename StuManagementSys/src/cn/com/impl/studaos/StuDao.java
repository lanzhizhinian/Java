package cn.com.impl.studaos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import cn.com.bean.StudentBean;
import cn.com.db.DBUtil;
import cn.com.inf.StuDaoInf;

public class StuDao implements StuDaoInf {

	private static Statement pstm;
	private String sql;
	
	public StuDao() {
	}

	static {
		pstm = DBUtil.getStatement();
		System.out.println("stuDao类已加载！");
	}
	
	public void closeDao() {
		DBUtil.close();
	}
	
	@Override
	public boolean validateStuNo(String stuNo) {
		boolean judge = false;
		sql = "select * from stuInfo where stuNo = '"+stuNo+"'";
		ResultSet rs = null;
		try {
			rs = pstm.executeQuery(sql);
			if(rs.next()) {
				judge = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return judge;
	}

	@Override
	public boolean addStudentDao(StudentBean stu) {
		boolean judge = false;
		sql = "insert into stuInfo (stuid,stuNo,stuName,stuPassword,age,sex,addr) values ("+
				"sq_stuInfo_id.nextval,'"+stu.getStuNo()+"','"+stu.getStuName()+"','"+stu.getStuPassword()+"',"+
				stu.getAge()+",'"+stu.getSex()+"','"+stu.getAddr()+"'"+")";
		try {
			int len = pstm.executeUpdate(sql);
			if(len > 0) {
				judge = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return judge;
	}

	@Override
	public boolean delStuByNameDao(String stuName) {
		boolean judge = false;
		sql = "delete from stuInfo where stuName like '%"+stuName+"%'";
		try {
			int len = pstm.executeUpdate(sql);
			if(len > 0) {
				judge = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return judge;
	}

	@Override
	public boolean delStuByStuNoDao(String stuNo) {
		boolean judge = false;
		sql = "delete from stuInfo where stuNo = '"+stuNo+"'";
		try {
			int len = pstm.executeUpdate(sql);
			if(len > 0) {
				judge = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return judge;
	}

	@Override
	public boolean updateDao(StudentBean stu) {
		boolean judge = false;
		sql = "update stuInfo set stuName = '"+stu.getStuName()+"',stuPassword = '"+stu.getStuPassword()
		+"',age = "+stu.getAge()+",sex = '"+stu.getSex()+"',addr = '"+stu.getAddr()+"' where stuNo = '"+stu.getStuNo()+"'";
		try {
			int len = pstm.executeUpdate(sql);
			if(len > 0) {
				judge = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return judge;
	}

	@Override
	public List<StudentBean> searchByStuNameDao(String stuName) {
		List<StudentBean> ls = new ArrayList<StudentBean>();
		sql = "select stuNo,stuName,age,sex,addr from stuInfo where stuName like '%"+stuName+"%'";
		ResultSet rs = null;
		try {
			rs = pstm.executeQuery(sql);
			transition(rs,ls);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return ls;
	}

	@Override
	public List<StudentBean> searchStuByStuNoDao(String stuNo) {
		ArrayList<StudentBean> ls = new ArrayList<StudentBean>();
		sql = "select stuNo,stuName,age,sex,addr from stuInfo where stuNo = '"+stuNo+"'";
		ResultSet rs = null;
		try {
			rs = pstm.executeQuery(sql);
			transition(rs,ls);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return ls;
	}

	@Override
	public List<StudentBean> getAllStudentInfoDao() {
		ArrayList<StudentBean> ls = new ArrayList<StudentBean>();
		sql = "select * from stuInfo";
		ResultSet rs = null;
		try {
			rs = pstm.executeQuery(sql);
			transition(rs,ls);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return ls;
	}

	@Override
	public boolean isEmpty() {
		boolean judge = false;
		if(this.getAllStudentInfoDao().isEmpty()) {
			judge = true;
		}
		return judge;
	}
	
	/**
	 * 用于将查询返回的结果集转换成集合
	 * @param rs	-	结果集
	 * @param ls	-	存放结果集的集合
	 * @throws SQLException	-	发生的SQL异常
	 */
	private void transition(ResultSet rs, List<StudentBean> ls) throws SQLException {
		while(rs.next()) {
			int age = rs.getInt("age");
			String stuNo = rs.getString("stuNo");
			String stuName = rs.getString("stuName");
			String sex = rs.getString("sex");
			String addr = rs.getString("addr");
			StudentBean stu = new StudentBean();
			stu.setStuNo(stuNo);
			stu.setStuName(stuName);
			stu.setAge(age);
			stu.setSex(sex.charAt(0));
			stu.setAddr(addr);
			ls.add(stu);
		}
	}

	@Override
	public boolean loginIdentityDao(String stuNo, String stuPassword) {
		boolean judge = false;
		sql = "select stuNo,stuPassword from stuInfo where stuNo = '"
				+stuNo+"' and stuPassword = '"+stuPassword+"'";
		ResultSet rs = null;
		try {
			rs = pstm.executeQuery(sql);
			System.out.println(rs);
			if(rs.next()) {
				judge = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return judge;
	}

}

package cn.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		Connection conn = null;
		Statement pstm = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:mldn", "scott", "tiger");
			pstm = conn.createStatement();
			rs = pstm.executeQuery("select * from emp where 1 <> 1");
			
			System.out.println(" 职工号  "+" 姓名  "+" 职业  "+" 领导工号  "+" 雇佣日期  "+" 薪水  "+" 奖金  "+" 部门编号");
			
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				String hiredate = rs.getString("hiredate");
				float sal = rs.getFloat("sal");
				float comm = rs.getFloat("comm");
				int deptno = rs.getInt("deptno");
				System.out.println(empno+"  "+ename+"  "+job+"  "+mgr+"  "+hiredate+"  "+sal+"  "
				+comm+"  "+deptno);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(pstm != null) {
					pstm.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
}

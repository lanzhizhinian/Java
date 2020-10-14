package cn.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) {
		String sql = null;
		sql = "delete from tbemp  where eid = 2";
		execute("É¾³ý",sql);
	}

	private static void execute(String type, String sql) {
		Connection conn = null;
		Statement pstm = null;
		int len = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:mldn","scott","tiger");
			pstm = conn.createStatement();
			len = pstm.executeUpdate(sql);
			
			if(len > 0) {
				System.out.println(type+"³É¹¦£¡");
			} else {
				System.out.println(type+"Ê§°Ü£¡");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(pstm != null) {
				try {
					pstm.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}

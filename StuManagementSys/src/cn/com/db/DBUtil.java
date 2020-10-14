package cn.com.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DBUtil {
	
	private static Connection conn;
	private static Statement pstm;
	
	private DBUtil() {
	}
	
	static {
		load();
		System.out.println("DBUtil工具类已加载");
	}
	
	/**
	 * 用于查看所有学生信息
	 * @return	-	学生集合
	 */
	public static Statement getStatement() {
		return pstm;
	}
	
	public static void close() {
		try {
			
		} finally {
			if(pstm != null) {
				try {
					pstm.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
	
	private static void load() {
		boolean judge = false;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:mldn","scott","tiger");
			pstm = conn.createStatement();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			judge = true;
			e.printStackTrace();
		} finally {
			if(judge) {
				close();
			}
		}
		
		
	}
	
}

package cn.com.db;
import java.util.HashMap;
import cn.com.beans.Student;

public abstract class DBUtil {

	private static HashMap<String,Student> stuMap;
	
	private DBUtil() {
		
	}
	
	static {
		stuMap = new HashMap<String,Student>();
	}
	
	public static int size() {
		return stuMap.size();
	}
	
	public static HashMap<String,Student>getAllStuInfo() {
		return stuMap;
	}
}

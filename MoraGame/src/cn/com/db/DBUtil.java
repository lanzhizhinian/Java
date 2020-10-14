package cn.com.db;

public abstract class DBUtil {

	private static int ptimes;
	private static int ctimes;
	private static int eqtimes;
	
	private DBUtil() {
		
	}

	public static int getPtimes() {
		return ptimes;
	}

	public static void setPtimes(int ptimes) {
		DBUtil.ptimes = ptimes;
	}

	public static int getCtimes() {
		return ctimes;
	}

	public static void setCtimes(int ctimes) {
		DBUtil.ctimes = ctimes;
	}

	public static int getEqtimes() {
		return eqtimes;
	}

	public static void setEqtimes(int eqtimes) {
		DBUtil.eqtimes = eqtimes;
	}
	
	
	
}

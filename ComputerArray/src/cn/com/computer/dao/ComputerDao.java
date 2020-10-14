package cn.com.computer.dao;

import cn.com.classpackage.Computer;
import cn.com.computer.beans.DBUtil;

public class ComputerDao {

	public void setComputerArray(int size) {
		DBUtil.initComputerArray(size);
	}
	
	public Computer[] getComputerArray() {
		return DBUtil.getComputerArray();
	}
	
	public int getComputerSize() {
		return DBUtil.getIndex();
	}
	
	public boolean validateSerialNumber(String serialNumber) {
		boolean judge = false;
		Computer[] computerArray = DBUtil.getComputerArray();
		for(int i = 0;i < DBUtil.getIndex();i++) {
			if(serialNumber.equals(computerArray[i].getSerialNumber())) {
				judge = true;
				break;
			}
		}
		return judge;
	}
	
	public boolean addComputerArray(Computer computer) {
		boolean judge = false;
		Computer[] computerArray = DBUtil.getComputerArray();
		computerArray[DBUtil.getIndex()] = computer;
		DBUtil.setIndex(DBUtil.getIndex()+1);
		judge = true;
		return judge;
	}
}

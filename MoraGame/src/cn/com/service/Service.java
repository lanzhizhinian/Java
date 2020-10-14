package cn.com.service;
import cn.com.db.DBUtil;
import cn.com.serviseinf.ServiceInf;

public class Service implements ServiceInf {

	/* (non-Javadoc)
	 * @see cn.com.service.ServiceInf#judge(int, int, int, cn.com.bean.Participant)
	 */
	@Override
	public void judge(int num1, int num2) {
		int result = num1 - num2;
		transition("电脑", num1);
		transition("玩家", num2);
		if (result == 0) {
			DBUtil.setEqtimes(DBUtil.getEqtimes()+1);
			System.out.println("平局");
		}else if (result == -1 || result == 2) {
			DBUtil.setCtimes(DBUtil.getCtimes()+1);
			System.out.println("电脑获胜");
		}else {
			DBUtil.setPtimes(DBUtil.getPtimes()+1);
			System.out.println("玩家获胜");
		}
	}

	/* (non-Javadoc)
	 * @see cn.com.service.ServiceInf#validateByInput(int)
	 */
	@Override
	public int validateByInput(int num) {
		if (num < 1 || num > 4) {
			return -1;
		} else if (num == 4) {
			return 0;
		}
		return 1;
	}

	/* (non-Javadoc)
	 * @see cn.com.service.ServiceInf#transition(java.lang.String, int)
	 */
	@Override
	public void transition(String identity, int num) {
		switch (num) {
		case 1:
			System.out.println(identity + " 出了石头");
			break;
		case 2:
			System.out.println(identity + " 出了剪刀");
			break;
		case 3:
			System.out.println(identity + " 出了布");
		}
	}

	/* (non-Javadoc)
	 * @see cn.com.service.ServiceInf#transFormat(java.lang.String)
	 */
	@Override
	public int transFormat(String input) {
		int num = 0;
		try {
			num = Integer.parseInt(input);
		}catch (NumberFormatException nfe) {
			num = -1;
		}
		return num;
	}

	@Override
	public int getRandom(int num) {
		return (int)(Math.random()*100)%3+1;
	}
	
}

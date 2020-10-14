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
		transition("����", num1);
		transition("���", num2);
		if (result == 0) {
			DBUtil.setEqtimes(DBUtil.getEqtimes()+1);
			System.out.println("ƽ��");
		}else if (result == -1 || result == 2) {
			DBUtil.setCtimes(DBUtil.getCtimes()+1);
			System.out.println("���Ի�ʤ");
		}else {
			DBUtil.setPtimes(DBUtil.getPtimes()+1);
			System.out.println("��һ�ʤ");
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
			System.out.println(identity + " ����ʯͷ");
			break;
		case 2:
			System.out.println(identity + " ���˼���");
			break;
		case 3:
			System.out.println(identity + " ���˲�");
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

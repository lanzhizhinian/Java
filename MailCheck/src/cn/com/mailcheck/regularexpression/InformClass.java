package cn.com.mailcheck.regularexpression;

public class InformClass {

	private static String msg;
	
	private InformClass() {
		;
	}
	
	public static void formatInfo(int info) {
		switch(info) {
			case 1:
				msg = "��ʽ��������,ͬʱ�߱�@��  .....";
				break;
			case 2:
				msg = "��ʽ��������,@����ֻ��һ��....";
				break;
			case 3:
				msg = "��ʽ��������,@�� . �����ڿ�ͷ....";
				break;
			case 4:
				msg = "��ʽ��������,@�� . �����ڽ�β....";
				break;
			case 5:
				msg = "��ʽ��������,@�����ڵ�һ�� . ��ǰ��....";
				break;
			case 6:
				msg = "��ʽ��������,@�� . ��������һ��....";
				break;
		}
		formatInfo(msg);
	}
	
	public static void formatInfo(String info) {
		System.out.println(info);
	}
	
}


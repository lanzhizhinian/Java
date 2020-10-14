package cn.com.mailcheck.regularexpression;

public class InformClass {

	private static String msg;
	
	private InformClass() {
		;
	}
	
	public static void formatInfo(int info) {
		switch(info) {
			case 1:
				msg = "格式输入有误,同时具备@和  .....";
				break;
			case 2:
				msg = "格式输入有误,@有且只有一个....";
				break;
			case 3:
				msg = "格式输入有误,@和 . 不能在开头....";
				break;
			case 4:
				msg = "格式输入有误,@和 . 不能在结尾....";
				break;
			case 5:
				msg = "格式输入有误,@必须在第一个 . 的前面....";
				break;
			case 6:
				msg = "格式输入有误,@和 . 不能连在一起....";
				break;
		}
		formatInfo(msg);
	}
	
	public static void formatInfo(String info) {
		System.out.println(info);
	}
	
}


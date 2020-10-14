package cn.com.mailcheck.regularexpression;

import java.util.regex.Pattern;

public class MailCheckService {
	
	public static boolean formatJudge(String input) {
		String regx = "^([1-9][0-9]{8,10})+@[a-z]{2}+(\\.[a-z]{3})$";
		boolean judge = Pattern.matches(regx, input);
		return judge;
	}
	
}

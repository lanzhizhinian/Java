package cn.com.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternmatcherTest {
//	描述：把一个字符串中的手机号获取出来
	public static void main(String[] args) {
		String s = "我的手机号码是18988888888，曾经用过18987654321，还用过18812345678";

		String regex = "1[3578]\\d{9}"; // 手机号码的正则表达式
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);

		while (m.find()) { // 查找满足正则表达式的手机号,找到返回true
			String s1 = m.group(); // 返回查找到的手机号
			System.out.println(s1);
		}
	}

}

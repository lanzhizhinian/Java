package cn.com.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternmatcherTest {
//	��������һ���ַ����е��ֻ��Ż�ȡ����
	public static void main(String[] args) {
		String s = "�ҵ��ֻ�������18988888888�������ù�18987654321�����ù�18812345678";

		String regex = "1[3578]\\d{9}"; // �ֻ������������ʽ
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);

		while (m.find()) { // ��������������ʽ���ֻ���,�ҵ�����true
			String s1 = m.group(); // ���ز��ҵ����ֻ���
			System.out.println(s1);
		}
	}

}

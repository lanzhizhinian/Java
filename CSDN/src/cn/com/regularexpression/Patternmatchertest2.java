package cn.com.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patternmatchertest2 {

    public static void main(String[] args) {

		String str = "abcdefg";

		String regex = "ABC*";

		// ƥ��ʱ���Դ�Сд

		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

		// ��װ��ƥ����ַ���

		Matcher matcher = pattern.matcher(str);

		// ������ƥ����ַ����Ƿ���������ʽ�������Ӵ�

		boolean bool = matcher.find();

		System.out.println(bool);// true

	}

}

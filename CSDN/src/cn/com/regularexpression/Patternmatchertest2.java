package cn.com.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patternmatchertest2 {

    public static void main(String[] args) {

		String str = "abcdefg";

		String regex = "ABC*";

		// 匹配时忽略大小写

		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

		// 包装被匹配的字符串

		Matcher matcher = pattern.matcher(str);

		// 看看被匹配的字符串是否有正则表达式描述的子串

		boolean bool = matcher.find();

		System.out.println(bool);// true

	}

}

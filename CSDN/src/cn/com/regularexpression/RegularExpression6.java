package cn.com.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression6 {
	/*
	 * 获取功能：获取下面这个字符串中由三个字符组成的单词 da jia ting wo shuo jin tian yao xia yu,bu shang
	 * wan zi xi,gao xing bu ?
	 * 
	 * 调用匹配器对象功能 匹配器的对象功能有三个 
	 * 1.matches 方法尝试将整个输入序列与该模式匹配 
	 * 2.lookingAt	尝试将从区域开头开始输入序列与该模式匹配 
	 * 3.find 查找有没有满足条件的子串 上面的如果匹配成功 可以通过Start end group方法获得更多信息 
	 * 返回值int start()： 返回以前匹配的初始索引 
	 * 返回值int end()；返回最后匹配字符之后的偏移量
	 * 返回值String group()：返回由以前匹配操作所匹配的子序列
	 * 
	 * // 一定要先find()，然后才能group() //否则会报错找不到
	 * 
	 */
	public static void main(String[] args) {
		// 定义字符串
		String s = "da jia ting wo shuo jin tian yao xia yu,bu shang wan zi xi,gao xing bu ?";
		String regex = "\\b\\w{3}\\b";

		// 把规则编译成模式对象
		Pattern p = Pattern.compile(regex);
		// 通过模式对象得到匹配对象
		Matcher m = p.matcher(s);
		// 调用匹配器对象功能
		// find 查找有没有满足条件的子串
		// public boolean find()
		boolean flag = m.find();
		System.out.println(flag);
		// 如何得到值呢？
		// 得到一个
		String ss = m.group();
		System.out.println(ss);
		// 得到全部
		while (m.find()) {
			System.out.println(m.group());
		}

		// 注意：
		// 一定要先find()，然后才能group()
		// 否则会报错找不到
	}

}

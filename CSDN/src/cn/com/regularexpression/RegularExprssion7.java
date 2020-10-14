package cn.com.regularexpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExprssion7 {

	/*
	 * 获取功能
	 *       Pattern和MAther类的使用
	 *       模式和匹配器基本的使用顺序
	 */
		public static void main(String[] args) {
			//模式和匹配器的典型调用
			//把正则表达式编译成模式对象
	        Pattern p = Pattern.compile("a*b");//模式对象
	        //通过模式对象得到匹配对象，这个时候需要的式被匹配的字符串
	        Matcher m = p.matcher("aaaaaab");//匹配对象
	        boolean b = m.matches();
	        System.out.println(b);
	        
	        //这个是判断功能，但是如果做判断，这样就有点麻烦，我们直接有字符串的方法做
	        String s ="aaaaaab";
	        String ss = "a*b";
	        boolean sss = s.matches(ss);
	        System.out.println(sss);
	        
		}
}

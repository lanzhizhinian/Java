package cn.com.regularexpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExprssion7 {

	/*
	 * ��ȡ����
	 *       Pattern��MAther���ʹ��
	 *       ģʽ��ƥ����������ʹ��˳��
	 */
		public static void main(String[] args) {
			//ģʽ��ƥ�����ĵ��͵���
			//��������ʽ�����ģʽ����
	        Pattern p = Pattern.compile("a*b");//ģʽ����
	        //ͨ��ģʽ����õ�ƥ��������ʱ����Ҫ��ʽ��ƥ����ַ���
	        Matcher m = p.matcher("aaaaaab");//ƥ�����
	        boolean b = m.matches();
	        System.out.println(b);
	        
	        //������жϹ��ܣ�����������жϣ��������е��鷳������ֱ�����ַ����ķ�����
	        String s ="aaaaaab";
	        String ss = "a*b";
	        boolean sss = s.matches(ss);
	        System.out.println(sss);
	        
		}
}

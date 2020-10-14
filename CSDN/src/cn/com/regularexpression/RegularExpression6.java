package cn.com.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression6 {
	/*
	 * ��ȡ���ܣ���ȡ��������ַ������������ַ���ɵĵ��� da jia ting wo shuo jin tian yao xia yu,bu shang
	 * wan zi xi,gao xing bu ?
	 * 
	 * ����ƥ���������� ƥ�����Ķ����������� 
	 * 1.matches �������Խ����������������ģʽƥ�� 
	 * 2.lookingAt	���Խ�������ͷ��ʼ�����������ģʽƥ�� 
	 * 3.find ������û�������������Ӵ� ��������ƥ��ɹ� ����ͨ��Start end group������ø�����Ϣ 
	 * ����ֵint start()�� ������ǰƥ��ĳ�ʼ���� 
	 * ����ֵint end()���������ƥ���ַ�֮���ƫ����
	 * ����ֵString group()����������ǰƥ�������ƥ���������
	 * 
	 * // һ��Ҫ��find()��Ȼ�����group() //����ᱨ���Ҳ���
	 * 
	 */
	public static void main(String[] args) {
		// �����ַ���
		String s = "da jia ting wo shuo jin tian yao xia yu,bu shang wan zi xi,gao xing bu ?";
		String regex = "\\b\\w{3}\\b";

		// �ѹ�������ģʽ����
		Pattern p = Pattern.compile(regex);
		// ͨ��ģʽ����õ�ƥ�����
		Matcher m = p.matcher(s);
		// ����ƥ����������
		// find ������û�������������Ӵ�
		// public boolean find()
		boolean flag = m.find();
		System.out.println(flag);
		// ��εõ�ֵ�أ�
		// �õ�һ��
		String ss = m.group();
		System.out.println(ss);
		// �õ�ȫ��
		while (m.find()) {
			System.out.println(m.group());
		}

		// ע�⣺
		// һ��Ҫ��find()��Ȼ�����group()
		// ����ᱨ���Ҳ���
	}

}

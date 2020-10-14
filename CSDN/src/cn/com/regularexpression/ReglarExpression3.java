package cn.com.regularexpression;
import java.util.Scanner;

public class ReglarExpression3 {
	/*
	 * 分割功能 String类的public String[] split(String regex) 根据正则表达式匹配拆分此字符串
	 * 
	 * 
	 * 举例： 百合网，世纪佳缘，珍爱网，QQ 搜索好友 性别：女 范围：“18-24”
	 * 
	 * age>=18 && age<=24
	 */
	public static void main(String[] args) {
		// 定义一个年龄搜索范围
		String ages = "18-24";

		// 定义规则
		String regex = "-";

		// 调用方法
		String[] strArray = ages.split(regex);

		// 遍历
//			for(int x =0;x<strArray.length;x++) {
//				System.out.println(strArray[x]);
//			}

		// 如何得到int类型的
		int startAge = Integer.parseInt(strArray[0]);
		int endtAge = Integer.parseInt(strArray[1]);

		// 键盘录入年龄
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的年龄");
		int age = sc.nextInt();

		if (age >= startAge && age <= endtAge) {
			System.out.println("你就是我想找的");
		} else {
			System.out.println("你不符合我的要求");
		}
	}

}

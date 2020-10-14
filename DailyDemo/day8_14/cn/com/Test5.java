package cn.com;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Test5 {
	
	private static Scanner sc = new Scanner(System.in);

	//类中可以定义接口
	public interface test {
		void print();
	}
	
	public static void main(String[] args) {
		
		System.out.println("请输入路径名：");
		String path = sc.next();
		
		try {
			Class c = Class.forName(path);
			Class[] t = c.getDeclaredClasses();
			for(Class m:t) {
				System.out.println(m);
			}
			
			
			System.out.println();
			System.out.println("-------------------------------------------");
			System.out.println();
			
			
			while(c != null) {
				System.out.println(c.getName()+"属性如下：");
				Field[] fields = c.getDeclaredFields();
				if(fields == null) {
					break;
				}
				for(Field field:fields) {
					System.out.println(field.getName()+" 修饰符："+Modifier.toString(field.getModifiers()));
				}
				System.out.println("----------------------");
				c = c.getSuperclass();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}

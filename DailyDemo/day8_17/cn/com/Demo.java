package cn.com;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入类路径：");
		String path = sc.next();
		
		try {
			Class c = Class.forName(path);
			do {
				
				if(Modifier.isAbstract(c.getModifiers())) {
					System.out.println("输入的类为抽象类或者接口！");
					return;
				}
				
				Object obj = c.newInstance();
				
				System.out.println(path + "下的方法如下！");
				Method[] methods = c.getDeclaredMethods();
				for(Method method:methods) {
					
					method.setAccessible(true);
					
					Class[] parameters = method.getParameterTypes();
					Object[] values = new Object[parameters.length];
					for(int i = 0;i < parameters.length;i++) {
						System.out.println("请输入: "+parameters[i]+"  类型的数据");
						String input = sc.next();
						if(parameters[i] == int.class) {
							values[i] = Integer.valueOf(input);
						} else if(parameters[i] == short.class) {
							values[i] = Short.valueOf(input);
						} else if(parameters[i] == long.class) {
							values[i] = Long.valueOf(input);
						} else if(parameters[i] == byte.class) {
							values[i] = Byte.valueOf(input);
						} else if(parameters[i] == float.class) {
							values[i] = Float.valueOf(input);
						} else if(parameters[i] == double.class) {
							values[i] = Double.valueOf(input);
						} else if(parameters[i] == char.class) {
							values[i] = Character.valueOf(input.charAt(0));
						} else if(parameters[i] == String.class) {
							values[i] = input;
						} else if(parameters[i] == boolean.class) {
							values[i] = Boolean.valueOf(input);
						}
					}
					
					Class returnValue = method.getReturnType();
					if(returnValue == void.class) {
						method.invoke(obj, values);
					}else {
						method.invoke(obj, values); 
						System.out.println("返回值类型为："+returnValue);
					}
					
				}
				
				System.out.println("--------------------");
				c = c.getSuperclass();
			} while(c != Object.class);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		}
		
	}
	
}

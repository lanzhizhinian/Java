package cn.com;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo6 {

	public static void main(String[] args) {
		
		Class c = Student1.class;
		Constructor[] constructors = null;
		
		constructors = c.getDeclaredConstructors();
		for(Constructor constructor:constructors) {
			constructor.setAccessible(true);
			Class[] clazz = constructor.getParameterTypes();
			for(Class clas:clazz) {
				System.out.println(clas);
			}
			try {
				constructor.newInstance(clazz);
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

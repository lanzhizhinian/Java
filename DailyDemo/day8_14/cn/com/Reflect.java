package cn.com;
import java.lang.reflect.Field;

public class Reflect {
	public static void main(String[] args) {
		Class c1 = Person1.class;
		
		try {
			Object obj = c1.newInstance();
			Field f1 = c1.getDeclaredField("age");
			f1.setAccessible(true);
			f1.set(obj, 13);
			System.out.println(f1.get(obj));
			System.out.println(((Person1) obj).getAge());
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		c1.isPrimitive();
		
	}
	
	public void init() {
		
	}
	
}
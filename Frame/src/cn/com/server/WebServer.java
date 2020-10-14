package cn.com.server;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Map;

import cn.com.action.abs.Action;
import cn.com.beans.ConfigBean;
import cn.com.beans.Person;

public class WebServer {

	private String path;
	private static Map<String,ConfigBean> views;
	
	static {
		views = Load.getConfig();
	}
	
	public WebServer() {

	}
	
	public WebServer(String path) {
		this.path = path;
		init();
	}
	
	private void init() {
		ConfigBean config = views.get(path);
		Class clazz = null;
		Person person = null;
		Action action = null;
		String beanPath = config.getBeanPath();
		String actionPath = config.getActionPath();
		if(beanPath != null) {
			person = Encapsulation(config);
		}
		
		try {
			clazz = Class.forName(actionPath);
			action = (Action)clazz.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		action.execute(person);
	}

	private Person Encapsulation(ConfigBean config) {
		Person bean = null;
		String viewPath = config.getViewPath();
		String beanPath = config.getBeanPath();
		Map<String,String> values = Load.loadView(viewPath);
		Class clazz = null;
		try {
			clazz = Class.forName(beanPath);
			bean = (Person) clazz.newInstance();
			Field[] fields = clazz.getDeclaredFields();
			
			for(Field field:fields) {
				field.setAccessible(true);
				Class type = field.getType();
				String value = values.get(field.getName());
				if(value != null) {
					
					if(type == byte.class) {
						field.set(bean, Byte.valueOf(value));
					} else if(type == short.class) {
						field.set(bean, Short.valueOf(value));
					} else if(type == int.class) {
						field.set(bean, Integer.valueOf(value));
					} else if(type == char.class) {
						field.set(bean, Character.valueOf(value.charAt(0)));
					} else if(type == boolean.class) {
						field.set(bean, Boolean.valueOf(value));
					} else if(type == long.class) {
						field.set(bean, Long.valueOf(value));
					} else if(type == float.class) {
						field.set(bean, Float.valueOf(value));
					} else if(type == double.class) {
						field.set(bean, Double.valueOf(value));
					} else if(type == String.class) {
						field.set(bean, value);
					}
					
				}
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return bean;
	}
	
	public Object commit(String methodName,Object obj,Object... objs) {
		Object ob = null;
		Method method = null;
		Class c = obj.getClass();
		
		@SuppressWarnings("rawtypes")
		Class[] classes = new Class[objs.length];
		for(int i = 0;i < objs.length;i++) {
			classes[i] = objs[i].getClass();
		}
		
		try {
			method = c.getDeclaredMethod(methodName,classes);
			if(Modifier.isAbstract(method.getModifiers())) {
				return ob;
			}
			method.setAccessible(true);
			
			ob = method.getReturnType();
			
			method.invoke(obj,objs);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
			
		return ob;
	}
	
	
}

package cn.com.factory;

import cn.com.impl.Incandescent;
import cn.com.impl.LED;
import cn.com.lamp.Lamp;

/**
 * ��̬����
 * @author yunsuowu
 *
 */
public class Factory {

	/**
	 * �׳��
	 */
	public final static String INCANDESCENT = "�׳��";
	
	/**
	 * LED��
	 */
	public final static String LED = "LED��";
	
	/**
	 * ̨��
	 */
	public static String LAMP = "̨��";
	
	public static <E> E getBuble(String type) {
		
		E buble = null;
		if(type.equals("�׳��")) {
			buble = (E)new Incandescent();
		}else if(type.equals("LED��")) {
			buble = (E)new LED();
		}else if(type.equals("̨��")) {
			buble = (E)new Lamp();
		}
		
		return buble;
	}
	
}

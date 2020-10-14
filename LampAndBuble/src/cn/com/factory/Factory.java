package cn.com.factory;

import cn.com.impl.Incandescent;
import cn.com.impl.LED;
import cn.com.lamp.Lamp;

/**
 * ¾²Ì¬¹¤³§
 * @author yunsuowu
 *
 */
public class Factory {

	/**
	 * °×³ãµÆ
	 */
	public final static String INCANDESCENT = "°×³ãµÆ";
	
	/**
	 * LEDµÆ
	 */
	public final static String LED = "LEDµÆ";
	
	/**
	 * Ì¨µÆ
	 */
	public static String LAMP = "Ì¨µÆ";
	
	public static <E> E getBuble(String type) {
		
		E buble = null;
		if(type.equals("°×³ãµÆ")) {
			buble = (E)new Incandescent();
		}else if(type.equals("LEDµÆ")) {
			buble = (E)new LED();
		}else if(type.equals("Ì¨µÆ")) {
			buble = (E)new Lamp();
		}
		
		return buble;
	}
	
}

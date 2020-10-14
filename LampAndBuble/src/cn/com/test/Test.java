package cn.com.test;

import java.util.ArrayList;
import java.util.List;
import cn.com.factory.Factory;
import cn.com.inf.BubleInf;
import cn.com.lamp.Lamp;

public class Test {

	public static void main(String[] args) {
		BubleInf buble1 = Factory.getBuble(Factory.INCANDESCENT);
		BubleInf buble2 = Factory.getBuble(Factory.LED);
		List<BubleInf> bubleList = new ArrayList<BubleInf>();
		bubleList.add(buble1);
		bubleList.add(buble2);
		Lamp lamp = Factory.getBuble(Factory.LAMP);
		lamp.changeBuble(bubleList);
		
		lamp.lightOn();
		
		System.out.println("---------------");
		
		lamp.lightOff();
		
	}
	
}

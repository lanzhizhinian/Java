package cn.com.lamp;
import java.util.List;
import cn.com.inf.BubleInf;

public class Lamp {

	private List<BubleInf> bubles;
	
	public Lamp() {
		
	}
	
	public Lamp(List<BubleInf> bubles) {
		this.bubles = bubles;
	}
	
	public void changeBuble(List<BubleInf> buble) {
		this.bubles = buble;
	}
	
	public void lightOn() {
		List<BubleInf> bubles = this.bubles;
		for(BubleInf buble:bubles) {
			buble.lightOn();
		}
	}
	
	public void lightOff() {
		List<BubleInf> bubles = this.bubles;
		for(BubleInf buble:bubles) {
			buble.lightOff();
		}
	}
	
}

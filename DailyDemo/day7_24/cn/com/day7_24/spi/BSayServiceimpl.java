package cn.com.day7_24.spi;

import cn.com.day7_24.spi.service.sayService;

public class BSayServiceimpl implements sayService{

	@Override
	public void say(String word) {
		System.out.println(word + " B say: I am a girl");
	}

}

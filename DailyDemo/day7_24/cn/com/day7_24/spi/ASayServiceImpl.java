package cn.com.day7_24.spi;

import cn.com.day7_24.spi.service.sayService;

public class ASayServiceImpl implements sayService {

	@Override
	public void say(String word) {
		System.out.println(word+ "B say£ºI am a girl");
	}

}

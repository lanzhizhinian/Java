package cn.com.smartphone.smartphoneinf;
import cn.com.smartphone.baseinf.Phone;

public interface LowLevelPhone extends Phone{
	
	void commitCallUp(String tel1,String tel2);
	void commitSendMessage(String tel1,String tel2);
}

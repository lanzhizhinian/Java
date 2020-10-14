package cn.com.action;

import cn.com.action.abs.Action;
import cn.com.beans.Customer;
import cn.com.beans.Person;

public class LoginAction extends Action{

	@Override
	public void execute(Person person) {
		if(person != null) {
			System.out.println("信息如下：");
			System.out.println("姓名 ："+((Customer)person).getUserName());
			System.out.println("密码 ："+((Customer)person).getPwd());
		}
	}

}

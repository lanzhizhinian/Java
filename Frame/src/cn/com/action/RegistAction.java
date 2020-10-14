package cn.com.action;

import cn.com.action.abs.Action;
import cn.com.beans.Customer;
import cn.com.beans.Person;

public class RegistAction extends Action{

	@Override
	public void execute(Person person) {
		if(person != null) {
			System.out.println("信息如下：");
			System.out.println("姓名 ："+((Customer)person).getUserName());
			System.out.println("密码 ："+((Customer)person).getPwd());
			System.out.println("性别 ："+((Customer)person).getSex());
			System.out.println("年龄 ："+((Customer)person).getAge());
			System.out.println("身高 ："+((Customer)person).getHeight());
		}
	}

}

package cn.com.action;

import cn.com.action.abs.Action;
import cn.com.beans.Customer;
import cn.com.beans.Person;

public class RegistAction extends Action{

	@Override
	public void execute(Person person) {
		if(person != null) {
			System.out.println("��Ϣ���£�");
			System.out.println("���� ��"+((Customer)person).getUserName());
			System.out.println("���� ��"+((Customer)person).getPwd());
			System.out.println("�Ա� ��"+((Customer)person).getSex());
			System.out.println("���� ��"+((Customer)person).getAge());
			System.out.println("��� ��"+((Customer)person).getHeight());
		}
	}

}

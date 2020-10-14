package cn.com.exception;

public class PersonTest {

	public static void main(String[] args) {

		Person person = new Person();

		try {
			person.setSex('h');
		} catch (AgeException e) {
			e.printStackTrace();
		}

	}

}

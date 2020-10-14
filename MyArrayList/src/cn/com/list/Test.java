package cn.com.list;


public class Test {

	public static void main(String[] args) {
		MyArrayList<Person> mylist = new MyArrayList<Person>();
		
		int i = 0;
		
		for(i = 1;i <= 11;i++) {
			mylist.add(new Person(i));
		}
		
		
		for(i = 0;i < mylist.size();i++) {
			System.out.println(mylist.get(i).getAge());
		}
		
		MyArrayList<Person> list = new MyArrayList<Person>(32);
		
	}
	
}

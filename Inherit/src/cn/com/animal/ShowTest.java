package cn.com.animal;

public class ShowTest {
	
	public static void main(String[] args) {
		
		Show show = new Show();
		
		System.out.println("Dog���behavior������");
		Dog dog = new Dog();
		show.show(dog);
		
		System.out.println("Cat���behavior������");
		Cat cat = new Cat();
		show.show(cat);
		
		String[] test = new String[] {"10"};
		
	}
	
	
}

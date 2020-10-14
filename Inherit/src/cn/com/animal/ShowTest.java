package cn.com.animal;

public class ShowTest {
	
	public static void main(String[] args) {
		
		Show show = new Show();
		
		System.out.println("Dog类的behavior方法：");
		Dog dog = new Dog();
		show.show(dog);
		
		System.out.println("Cat类的behavior方法：");
		Cat cat = new Cat();
		show.show(cat);
		
		String[] test = new String[] {"10"};
		
	}
	
	
}

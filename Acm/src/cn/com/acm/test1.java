package cn.com.acm;
import java.util.InputMismatchException;
import java.util.Scanner;

class test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		
		try {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			System.out.println((num1+num2));
		}catch(InputMismatchException e) {
			
		}
		
	}
	
}

package cn.com.calendar;
import java.util.Calendar;
import java.util.Scanner;

public class CalendarDemo {

	private static Scanner sc;
	
	public static void main(String[] args) {
		init();
	}
	
	public static void init() {
		sc = new Scanner(System.in);
		System.out.println("����xxxx-xx-xx�ĸ�ʽ����������...");
		String input = sc.next();
		
		while(input.indexOf("-") == input.lastIndexOf("-")) {
			System.out.println("����������������������...");
			input = sc.next();
		}
		
		String[] temp = input.split("-");
		int[] date = new int[temp.length];
		for(int i = 0;i < date.length;i++) {
			date[i] = Integer.parseInt(temp[i]);
		}
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(date[0], date[1]-1, 1);
		
		int day = calendar.get(Calendar.DAY_OF_WEEK);

		System.out.println(input+"\n");
		
		System.out.println("����\t��һ\t�ܶ�\t����\t����\t����\t����\t");
		for(int i = 1;i < day;i++) {
			System.out.print("\t");
		}
		
		for(int i = day,j = 1;i <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH)+day-1;i++,j++) {
			System.out.print(j+"\t");
			if(i%7 == 0) {
				System.out.println();
			}
		}
		
	}
	
}

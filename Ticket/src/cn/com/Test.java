package cn.com;

public class Test {

	public static void main(String[] args) {
		
		TicketBunker store = new TicketBunker();
		
		TicketOffice tof = new TicketOffice(store);
		Thread wicket1 = new Thread(tof,"����1");
		Thread wicket2 = new Thread(tof,"����2");
		Thread wicket3 = new Thread(tof,"����3");
		
		wicket1.start();
		wicket2.start();
		wicket3.start();
		
	}
	
}

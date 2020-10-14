package cn.com;

public class TicketOffice implements Runnable{

	private int position;
	private TicketBunker store;
	
	@Override
	public void run() {
		for(;position < store.getCapcity();position++) {
			store.popTicket();
		}
	}
	
	public TicketOffice() {
	}
	
	public TicketOffice(TicketBunker store) {
		this.store = store;
	}

}

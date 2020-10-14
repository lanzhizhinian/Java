package cn.com;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TicketBunker {

	private Integer[] bunker;
	private final int TIME = 200;
	private int index;
	private int capcity;
	private final Lock lock;
	private final int SIZE = 20;
	
	//��֤������
	private int test = 20;

	public TicketBunker() {
		init(SIZE);
		lock = new ReentrantLock();
	}
	
	public TicketBunker(int capcity) {
		init(capcity);
		lock = new ReentrantLock();
	}
	
	private void init(int size) {
		this.capcity = size;
		bunker = new Integer[this.capcity];
		for(int i = 0;i < size;i++) {
			bunker[i] = i+1;
			this.index++;
		}
	}

	public int getCapcity() {
		return capcity;
	}

	public void popTicket() {
		try {
			lock.lock();
			if(this.index > 0) {
				this.index--;
				System.out.println(Thread.currentThread().getName()+" ���ڳ��۵�"+(bunker[index])+"����Ʊ...");
				try {
					Thread.sleep(TIME);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("�ѳ��۵�"+(bunker[index])+"����Ʊ");
			}
		} finally {
			lock.unlock();
			
			//��֤�����߳��Ƿ��������Lock֮��ִ��lock-unlock֮��Ĵ���
			System.out.println("                      "+(--this.test));
		}
	}
	
}

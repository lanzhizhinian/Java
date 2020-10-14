package cn.com;

public class Demo1 implements Runnable{
	
	private int num;
	private static int n;
	
	@Override
	public void run() {
		showNum();
		showNum2();
	}

	
	public void showNum() {
		synchronized(this) {
			num ++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" £º"+num);
		}
	}

	protected synchronized void showNum2() {
		num ++;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" £º"+num);
	}
	

	public Demo1() {
	
	}
	
}

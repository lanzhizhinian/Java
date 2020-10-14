package cn.com.test;

class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"ÏòÄãÎÊºÃ£¡");
	}
}

public class Demo1 {

	public static void main(String[] args) {
		MyThread[] mt = new MyThread[20];
		for(int i = 0;i < 20;i++) {
			mt[i] = new MyThread();
			mt[i].start();
		}
	}
	
}

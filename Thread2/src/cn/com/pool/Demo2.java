package cn.com.pool;

class Demo implements Runnable{

	@Override
	public void run() {
		for(int i = 0;i < 50;i++) {
			System.out.println(Thread.currentThread().getName()+"-"+i);
		}
	}

}

public class Demo2 {
	
	public static void main(String[] args) {
		
		Demo demo1 = new Demo();
		Demo demo2 = new Demo();
		
		Thread t1 = new Thread(demo1);
		Thread t2 = new Thread(demo2);
		t1.start();
		t2.start();
		
		for(int i = 0;i < 50;i++) {
			System.out.println(Thread.currentThread().getName()+"-"+i);
		}
		
		printTrack();
		
	}
	
	/**
	 * 打印当前线程的调用堆栈
	 * 
	 */
	static void printTrack(){
		StackTraceElement[] st = Thread.currentThread().getStackTrace();
		if(st==null){
			System.out.println("无堆栈...");
			return;
		}
		StringBuffer sbf =new StringBuffer();
		for(StackTraceElement e:st){
			if(sbf.length()>0){
				sbf.append(" <- ");
				sbf.append(System.getProperty("line.separator"));
			}
			sbf.append(java.text.MessageFormat.format("{0}.{1}() {2}"
					,e.getClassName()
					,e.getMethodName()
					,e.getLineNumber()));
		}
		System.out.println(sbf.toString());
	}
	
}
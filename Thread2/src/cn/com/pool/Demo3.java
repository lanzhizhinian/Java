package cn.com.pool;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;

public class Demo3 extends JLabel implements Runnable{

	private Date t;
	private int time;
	private boolean judge;
	private SimpleDateFormat sdf;
	
	@Override
	public void run() {
		while(judge) {
			try {
				t = new Date();
				this.setText(sdf.format(t));
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public boolean isJudge() {
		return judge;
	}

	public void setJudge(boolean judge) {
		this.judge = judge;
	}

	public Demo3(int time) {
		judge = true;
		this.time = time;
		this.sdf = new SimpleDateFormat("HH-mm-ss");
	}
	
}

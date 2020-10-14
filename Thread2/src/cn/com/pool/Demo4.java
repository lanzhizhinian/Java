package cn.com.pool;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo4 extends JFrame{

	private Demo3 lbl1;
	private Demo3 lbl2;
	private Demo3 lbl3;
	private JButton btn1;
	private JButton btn2;
	private JPanel jpanel;
	
	public Demo4() {
		lbl1 = new Demo3(1000);
		lbl2 = new Demo3(3000);
		lbl3 = new Demo3(5000);
		btn1 = new JButton("¿ªÊ¼");
		btn2 = new JButton("ÔÝÍ£");
		
		
		this.jpanel = new JPanel(null);
		
		
		this.setSize(500, 400);
		this.jpanel.setSize(500, 400);
		init();
	}

	private void init() {
		
		lbl1.setBounds(150, 100, 120, 30);
		lbl2.setBounds(150, 150, 120, 30);
		lbl3.setBounds(150, 200, 120, 30);
		btn1.setBounds(150, 250, 70, 30);
		btn2.setBounds(220, 250, 70, 30);
		Thread t1 = new Thread(lbl1);
		Thread t2 = new Thread(lbl2);
		Thread t3 = new Thread(lbl3);
		
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				start();
			}

		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				stop();
			}

		});
		
		jpanel.add(lbl1);
		jpanel.add(lbl2);
		jpanel.add(lbl3);
		jpanel.add(btn1);
		jpanel.add(btn2);
		
		
		t1.start();
		t2.start();
		t3.start();
		
		this.add(jpanel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void stop() {
		lbl1.setJudge(false);
		lbl2.setJudge(false);
		lbl3.setJudge(false);
	}
	
	private void start() {
		lbl1.setJudge(true);
		lbl2.setJudge(true);
		lbl3.setJudge(true);
		Thread t1 = new Thread(lbl1);
		Thread t2 = new Thread(lbl2);
		Thread t3 = new Thread(lbl3);
		t1.start();
		t2.start();
		t3.start();
	}
	
	public static void main(String[] args) {
		new Demo4();
	}
	
}

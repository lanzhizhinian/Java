package cn.com.socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.SocketException;

public class Send extends Thread{
	
	private String msg;
	private String name;
	private PrintWriter out;
	private BufferedReader br;
	
	public void run() {
		try {
			while(true) {
				msg = br.readLine();
				if(msg.equals("88")) {
					break;
				}
				out.println(this.name+" ："+msg);
			}
		} catch (SocketException se) {
			System.out.println("您的小可爱已离线！");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Send() {
		
	}
	
	public Send(PrintWriter out,BufferedReader br,String name) {
		this.name = name;
		this.br =  br;
		this.out = out;
	}
	
}

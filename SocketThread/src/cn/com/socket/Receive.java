package cn.com.socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.SocketException;

public class Receive extends Thread{

	private BufferedReader in;
	
	public void run() {
		String acc = "";
		try {
			while(true) {
				acc = in.readLine();
				if(acc == null) {
					System.out.println("�Է������ߣ�");
					break;
				}
				System.out.println(acc);
			}
		} catch (SocketException se) {
			System.out.println("����С�ɰ�������");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Receive(BufferedReader in) {
		this.in = in;
	}
	
}

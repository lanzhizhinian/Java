package cn.com.socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;

public class Client{

	private Socket server;
	private PrintWriter out;
	private BufferedReader br;
	private BufferedReader in;
	public static void main(String[] args) {
		new Client();
	}

	public Client() {
		try {
			server = new Socket("192.168.43.235", 9001);
			out = new PrintWriter(server.getOutputStream(),true);
			in = new BufferedReader(new InputStreamReader(server.getInputStream()));
			br = new BufferedReader(new InputStreamReader(System.in));
			chat();
		} catch (SocketException se) {
			System.out.println("您的小可爱已离线");
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(out != null) {
				out.close();
			}
			if(in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(server != null) {
				try {
					server.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private void chat() throws IOException {
		System.out.println("客户端");
		Send s = new Send(out,br,"客户端");
		Receive r = new Receive(in);
		s.start();
		r.start();
		while(s.isAlive() && r.isAlive()) {
			try {
				s.sleep(100);
				r.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("聊天结束！");
	}

}

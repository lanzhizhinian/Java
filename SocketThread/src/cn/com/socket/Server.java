package cn.com.socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{

	private ServerSocket server;
	private Socket s1;
	private PrintWriter out;
	private BufferedReader br;
	private BufferedReader in;
	public static void main(String[] args) {
		new Server();
	}

	public Server() {
		try {
			System.out.println("等待客户端连接...");
			server = new ServerSocket(9001);
			s1 = server.accept();
			out = new PrintWriter(s1.getOutputStream(),true);
			in = new BufferedReader(new InputStreamReader(s1.getInputStream()));
			br = new BufferedReader(new InputStreamReader(System.in));
			chat();
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
			if(s1 != null) {
				try {
					s1.close();
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

	private void chat() throws IOException{
		System.out.println("服务器");
		Send s = new Send(out,br,"服务器");
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

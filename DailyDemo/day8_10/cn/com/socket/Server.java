package cn.com.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;


public class Server {

	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket s = null;
		InputStream is = null;
		OutputStream os = null;
		
		try {
			ss = new ServerSocket(9001);
			
			byte[] a = new byte[1024];
			
			System.out.println("等待客户端连接...");
			
			s = ss.accept();
			String msg = "欢迎"+s.getInetAddress()+"进来";
			System.out.println(msg);
			is = s.getInputStream();
			os = s.getOutputStream();
			Scanner sc = new Scanner(System.in);
			String msgToClient = null;
			do {
				System.out.print("你说：");
				msgToClient = sc.next();
				os.write(msgToClient.getBytes());
				int len = is.read(a);
				String acc = new String(a,0,len);
				System.out.println("王："+acc);
			}while(!msgToClient.equals("88"));
			
		} catch (SocketException ce) {
			System.out.println("对方退出聊天！");
		}catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(is != null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(os != null) {
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(s != null) {
				try {
					s.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(ss != null) {
				try {
					ss.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}

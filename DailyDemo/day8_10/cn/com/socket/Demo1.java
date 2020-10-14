package cn.com.socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo1 {

	public static void main(String[] args) {
		try {
			InetAddress ip = InetAddress.getByName("www.baidu.com");
			System.out.println(ip);
			InetAddress[] ips = InetAddress.getAllByName("www.baidu.com");
			
			for(InetAddress temp:ips) {
				System.out.println(temp.getHostName());
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
}

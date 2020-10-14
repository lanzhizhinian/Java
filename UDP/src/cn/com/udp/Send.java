package cn.com.udp;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Send {

	private DatagramPacket packet;
	private DatagramSocket dsocket;
	
	public static void main(String[] args) {
		new Send();
	}
	
	public Send() {
		InetAddress ip = null;
		try {
			ip = InetAddress.getByName("192.168.43.235");
			dsocket = new DatagramSocket();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (SocketException e) {
			e.printStackTrace();
		}
		String msg = "你好，我来自ip：192.168.43.235的9001端口的消息";
		byte[] sendmsg = msg.getBytes();
		try {
			packet = new DatagramPacket(sendmsg,0,sendmsg.length,ip,9001);
			dsocket.send(packet);
			System.out.println("end");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(dsocket != null) {
				dsocket.close();
			}
		}
	}
	
}

package cn.com.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Receive {

	private DatagramPacket packet;
	private DatagramSocket dsocket;
	
	public static void main(String[] args) {
		new Receive();
	}
	
	public Receive() {
		byte[] msg = new byte[1024];
		try {
			dsocket = new DatagramSocket(9001);
			packet = new DatagramPacket(msg,msg.length);
			dsocket.receive(packet);
			String receivemsg = new String(msg,0,packet.getLength());
			System.out.println(receivemsg);
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(dsocket != null) {
				dsocket.close();
			}
		}
	}
}

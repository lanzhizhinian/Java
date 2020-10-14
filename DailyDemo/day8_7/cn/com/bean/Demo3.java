package cn.com.bean;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Demo3 {

	public static void main(String[] args) {
		File file = new File("data/t.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(baos);
		ByteArrayInputStream bais = null;
		DataInputStream dis = null;
		byte[] a = new byte[1024];
		PrintWriter outpw = null;
		PrintStream outps = null;
		
		try {
			outpw = new PrintWriter(new FileOutputStream(file) , true);
			//outps = new PrintStream(new FileOutputStream(file),true);
			dos.writeInt(23);
			dos.writeFloat(11.1f);
			dos.writeDouble(19);
			byte[] b = baos.toByteArray();
			
			bais = new ByteArrayInputStream(b);
			dis = new DataInputStream(bais);
			outpw.println("b的长度为:   "+b.length+"   字节");
			//outps.println("b的长度为:   "+b.length+"   字节");
			
			int num1 = dis.readInt();
			outpw.print(num1+"\t");
			//outps.println(num1);
			
			
			float num2 = dis.readFloat();
			outpw.print(num2+"\t");
			//outps.println(num2);
			
			double num3 = dis.readDouble();
			outpw.print(num3+"\t");
			//outps.println(num3);
			
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(dos != null) {
				try {
					dos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(baos != null) {
				try {
					baos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(dis != null) {
				try {
					dis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(bais != null) {
				try {
					bais.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(outpw != null) {
				outpw.close();
			}
			if(outps != null) {
				outps.close();
			}
		}
		
	}
	
}

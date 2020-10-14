package cn.com.bean;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Demo4 {

	public static void main(String[] args) {
		File file = new File("Byte/t.txt");
		if(!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
		
		DataOutputStream dos = null;
		DataInputStream dis = null;
		PrintStream out = System.out;
		
		try {
			dos = new DataOutputStream(new FileOutputStream(file));
			dis = new DataInputStream(new FileInputStream(file));
			dos.writeInt(22);
			dos.writeFloat(10.0f);
			
			int num1 = dis.readInt();
			out.println(num1);
			float num2 = dis.readFloat();
			out.println(num2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}

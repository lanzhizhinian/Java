package cn.com.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo1{
	public static void main(String[] args) throws IOException {
		FileOutputStream filestream = null;
		ObjectOutputStream out = null;
		try {
			filestream = new FileOutputStream("C:\\Users\\А¶ЦЅЦґДо\\Desktop\\test.txt");
			out = new ObjectOutputStream(filestream);
			Example e = new Example();
			
			out.writeObject(e);
			
		}catch (FileNotFoundException fnfe) {
			fnfe.getMessage();
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			filestream.close();
			out.close();
		}
	}
}

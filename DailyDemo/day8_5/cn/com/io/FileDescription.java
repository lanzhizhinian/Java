package cn.com.io;

import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;

public class FileDescription {

	public static void main(String[] args) {
		
		FileWriter fw = new FileWriter(FileDescriptor.in);
		try {
			fw.write("율율율율율");
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}

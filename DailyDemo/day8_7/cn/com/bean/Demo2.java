package cn.com.bean;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Demo2 {

	public static void main(String[] args) {
		PrintStream outps = null;
		PrintWriter outpw = null;
		try {
			outps = new PrintStream(new FileOutputStream(new File("data/t.txt")),true);
			outpw = new PrintWriter(new FileWriter(new File("data/t.txt")),true);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

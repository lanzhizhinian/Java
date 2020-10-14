package cn.com.application;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class Mysystem {

	public static InputStream in;
	public static PrintStream out;
	
	@SuppressWarnings("static-access")
	public Mysystem() {
		File fileout = new File("data/output.txt");
		if(!fileout.getParentFile().exists()) {
			fileout.getParentFile().mkdirs();
		}
		
		File filein = new File("data/input.txt");
		if(!filein.exists()) {
			try {
				filein.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			this.in = new FileInputStream(filein);
			this.out = new PrintStream(new FileOutputStream(fileout));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}

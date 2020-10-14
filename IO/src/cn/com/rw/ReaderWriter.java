package cn.com.rw;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriter {

	public static void main(String[] args) {
		
		File file = new File("D:/使用说明.txt");
		File file1 = new File("G:/使用说明");
		file1.mkdirs();
		
		File target = new File(file1.getPath()+"/"+file.getName());
		
		try {
			target.createNewFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		if(fileCopy(file,target)) {
			System.out.println("文件复制成功");
		}else {
			System.out.println("文件复制失败");
		}
 	}

	private static boolean fileCopy(File file, File file1) {
		boolean judge = false;
		FileReader fd = null;
		FileWriter fw = null;
		
		try {
			fd = new FileReader(file);
			fw = new FileWriter(file1,true);
			
			int len = 1024;
			char[] rd = new char[len];
			while((len = fd.read(rd)) != -1) {
				fw.write(rd,0,len);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fd == null) {
				try {
					fd.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fw == null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		judge = true;
		return judge;
	}
	
}

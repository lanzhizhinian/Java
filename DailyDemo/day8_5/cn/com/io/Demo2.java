package cn.com.io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Demo2 {
	
	public static void main(String[] args) {
		
		System.out.println("请输入目录路径：");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		File file = new File(input);
		
		if(file.exists()) {
			
			fileList(file);
			
		}else {
			System.out.println("指定文件不存在，程序结束。");
		}
		
	}

	private static void fileList(File file) {
		File[] filelist = file.listFiles();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh-mm");
		
		for(File file1:filelist) {
			Date date = new Date(file1.lastModified());
			String time = sdf.format(date);
			String name = file1.getName();
			System.out.print(time+"\t");
			if(file1.isDirectory()) {
				System.out.print("<DIR>\t");
			}else {
				System.out.print(file1.length()+"\t");
			}
			
			System.out.println(name);
			
		}
		
	}

	
}

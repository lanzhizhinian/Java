package cn.com.file_cut;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCut {

	public FileCut() {
		int i = 1;
		init();
	}

	private void init() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入源地址：");
		String srcPath = sc.nextLine();
		System.out.println("请输入目的地址：");
		String targetPath = sc.nextLine();
		File srcFile = new File(srcPath);
		
		if(!srcFile.exists()) {
			System.out.println("目的路径不存在，程序结束！");
			return;
		}
		
		//D:/1.txt
		//E:/test/test.txt
		
		File targetFile = new File(targetPath);
		if(!targetFile.getParentFile().exists()) {
			targetFile.getParentFile().mkdirs();
		}
		
		if(fileCut(srcFile,targetFile)) {
			System.out.println("文件剪切成功：");
		}else {
			System.out.println("文件剪切失败");
		}
	}

	/**
	 * 用于剪切文件
	 * @param srcFile	-	源地址
	 * @param targetFile	-	目的地址
	 * @param length	-	剪切的长度
	 * @return	ture-剪切成功	false-剪切失败
	 */
	private boolean fileCut(File srcFile,File targetFile) {
		boolean judge = false;
		FileInputStream fi = null;
		FileOutputStream fo = null;
		
		try {
			fi = new FileInputStream(srcFile);
			fo = new FileOutputStream(targetFile);
			int len = 5*1024*1024;
			byte[] container = new byte[len];
			try {
				while((len  = fi.read(container)) != -1) {
					fo.write(container, 0, len);
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}finally {
			if(fi != null) {
				try {
					fi.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
			if(fo != null) {
				try {
					fo.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
			
			srcFile.delete();
			
		}//finally块
		
		judge = true;
		return judge;
	}
	
}

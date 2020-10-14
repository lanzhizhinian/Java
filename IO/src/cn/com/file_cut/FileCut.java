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
		System.out.println("������Դ��ַ��");
		String srcPath = sc.nextLine();
		System.out.println("������Ŀ�ĵ�ַ��");
		String targetPath = sc.nextLine();
		File srcFile = new File(srcPath);
		
		if(!srcFile.exists()) {
			System.out.println("Ŀ��·�������ڣ����������");
			return;
		}
		
		//D:/1.txt
		//E:/test/test.txt
		
		File targetFile = new File(targetPath);
		if(!targetFile.getParentFile().exists()) {
			targetFile.getParentFile().mkdirs();
		}
		
		if(fileCut(srcFile,targetFile)) {
			System.out.println("�ļ����гɹ���");
		}else {
			System.out.println("�ļ�����ʧ��");
		}
	}

	/**
	 * ���ڼ����ļ�
	 * @param srcFile	-	Դ��ַ
	 * @param targetFile	-	Ŀ�ĵ�ַ
	 * @param length	-	���еĳ���
	 * @return	ture-���гɹ�	false-����ʧ��
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
			
		}//finally��
		
		judge = true;
		return judge;
	}
	
}

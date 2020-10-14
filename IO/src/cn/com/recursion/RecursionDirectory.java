package cn.com.recursion;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class RecursionDirectory {

	private Scanner sc;
	
	public RecursionDirectory() {
		
		init();
		
	}

	private void init() {
		sc = new Scanner(System.in);
		System.out.println("����������Ҫ������·����");
		String path = sc.next();
		
		File file = new File(path);
		File[] files = file.listFiles();
		
		recursion(files);
		System.out.println("����������");
	}

	/**
	 * ���ڱ���ָ��Ŀ¼�µ������ļ���
	 * @param file	-	�ȴ�������Ŀ¼·��
	 */
	private void recursion(File[] files) {
		if(files == null) {
			return;
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh-mm");
		
		for(File file:files) {
			Date date = new Date(file.lastModified());
			String time = sdf.format(date);
			String name = file.getName();
			
			System.out.print(time+"\t");
			
			if(file.isDirectory()) {
				System.out.print("<DIR>\t");
				File[] directory = file.listFiles();
				System.out.println(name);
				recursion(directory);
			}else {
				System.out.print("\t");
				System.out.println(name);
			}
			
		}
		
	}
	
}

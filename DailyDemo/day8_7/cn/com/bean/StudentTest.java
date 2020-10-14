package cn.com.bean;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentTest {

	public static void main(String[] args) {
		intit();
	}

	private static void intit() {
		File file = new File("data/t.txt");
		if(!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
		
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(file));
			Student stu = new Student(21,"ª∆≈Ù∑…","213");
			oos.writeObject(stu);
			
			ois = new ObjectInputStream(new FileInputStream(file));
			Student stu1 = null;
			try {
				stu1 = (Student) ois.readObject();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			System.out.println(stu1.getAge());
			System.out.println(stu1.getName());
			System.out.println(stu1.getNo());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}

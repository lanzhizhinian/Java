package com.exceptionmechanism;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class AutoCloseTest {

	public static void main(String[] args) 
	throws IOException{
		// TODO Auto-generated method stub
		try (
			BufferedReader br = new BufferedReader(
					new FileReader("AutoCloseTest.java"));	
			PrintStream ps = new PrintStream(
					new FileOutputStream("a.txt"))){
			System.out.println(br.readLine());
			ps.println("ׯ�������Ժ���");
		}
	}

}

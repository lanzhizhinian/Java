package cn.com.homemade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MyScanner {

	private BufferedReader br;
	
	public MyScanner(InputStream in) {
		this.br = new BufferedReader(new InputStreamReader(in));
	}
	
	public String MyNext() {
		String result = null;
		try {
			result = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int MynextInt() {
		int result = 0;
		
		try {
			String temp = br.readLine();
			result = Integer.parseInt(temp);
		} catch (IOException e) {
			e.printStackTrace();
		} catch(NumberFormatException nfe) {
			nfe.printStackTrace();
		}
		return result;
	}
	
}

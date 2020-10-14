package cn.com.application;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Myscanner {

	private BufferedReader in;
	
	public Myscanner(InputStream in) {
		this.in = new BufferedReader(new InputStreamReader(in));
	}
	
	public String next() {
		String result = null;
		try {
			result = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int nextInt() {
		int result = 0;
		try {
			String temp = in.readLine();
			result = Integer.parseInt(temp);
		} catch(NumberFormatException nfe) {
			nfe.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public float nextFloat() {
		float result = 0.0f;
		try {
			String temp = in.readLine();
			result = Float.parseFloat(temp);
		} catch(NumberFormatException nfe) {
			nfe.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public long nextLong() {
		long result = 0l;
		try {
			String temp = in.readLine();
			result = Long.parseLong(temp);
		} catch (NumberFormatException nfe) {
			nfe.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
	
}

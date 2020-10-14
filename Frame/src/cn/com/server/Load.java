package cn.com.server;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import cn.com.beans.ConfigBean;

abstract class Load {

	private static Map<String,ConfigBean> configMap;
	
	static {
		configMap = new HashMap<String,ConfigBean>();
		load();
	}
	
	private Load() {
		
	}
	
	private static void load() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(new File("WebView/xml.txt")));
			String line;
			while((line = br.readLine()) != null) {
				String[] lines = line.split("=");
				String[] paths = lines[1].split(";");
				ConfigBean cb = new ConfigBean();
				cb.setViewPath(paths[0]);
				cb.setActionPath(paths[1]);
				
				if(paths.length == 3) {
					cb.setBeanPath(paths[2]);
				}
				
				configMap.put(lines[0], cb);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	static Map<String,String> loadView(String viewPath) {
		Map<String,String> values = null;
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(new File("WebView/"+viewPath)));
			String line = br.readLine();
			String[] lines = line.split("&");
			values = new HashMap<String,String>();
			for(String info:lines) {
				String[] pair = info.split("=");
				values.put(pair[0], pair[1]);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return values;
	}
	
	public static Map<String,ConfigBean> getConfig() {
		return configMap;
	}
	
}

package com.util;

public class PropertyUtil {
	private static String filePath;
	public  void setFile(String path) {
		filePath=path;
		
	}
	public String loadFile() {
		return filePath;
	}

}

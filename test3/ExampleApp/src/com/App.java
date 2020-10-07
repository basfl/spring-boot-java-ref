package com;

import com.util.PropertyUtil;

public class App {
	private static PropertyUtil propertyUtil=new PropertyUtil();
	public static void main(String[] args) {
		if(args[0].equals(null)) {
			System.out.println("args=null");
		}
		ProcessorOne one=new ProcessorOne();
		propertyUtil.setFile(args[0]);
		one.func1();
		System.out.println("55"+args[0]);
	}

}

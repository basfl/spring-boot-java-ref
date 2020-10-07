package com;

import com.util.PropertyUtil;

public class ProcessorTwo {
	private static PropertyUtil propertyUtil=new PropertyUtil();
	public void func2() {
		System.out.println("here we load the file in p2"+propertyUtil.loadFile());
		
	}

}

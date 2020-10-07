package com;

import com.util.PropertyUtil;

public class ProcessorOne {
	private static PropertyUtil propertyUtil=new PropertyUtil();
	public void func1() {
		System.out.println("here we load the file p1"+propertyUtil.loadFile());
		ProcessorTwo two=new ProcessorTwo();
		two.func2();
	}

}

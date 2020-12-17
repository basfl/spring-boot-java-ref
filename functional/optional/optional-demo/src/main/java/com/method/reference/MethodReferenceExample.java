package com.method.reference;

public class MethodReferenceExample {

	public static void main(String[] args) {

		Thread t = new Thread(MethodReferenceExample::printMessage); // ()->printMessage()
		t.start();

	}

	private static void printMessage() {
		System.out.println("something");

	}

}

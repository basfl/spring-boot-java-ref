package com;

import java.util.Calendar;
import java.util.function.Function;

import com.service.ArithmaticService;

public class App {

	public static void main(String[] args) {
		ArithmaticService ar=(int a, int b) -> {
			System.out.println("\n **** " + (a + b));
		};
		Function<int[], Integer> f;
		add(1,2);
		cal(ar);
	

	}
	int f(int[] a) {
		return 0;
		
	}
	private static void cal(ArithmaticService ar) {
		ar.add(2, 3);
		
	}

	private static int add(int i, int j) {
		return i+j;
		
	}

	

}

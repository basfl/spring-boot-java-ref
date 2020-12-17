package com;

import java.util.function.Function;

/**
 * Hello world!
 *
 */
public class FunctionApp {
	public static void main(String[] args) {

		Integer increment2 = incrementByOneFunction.apply(2);
		System.out.println("***" + increment2);
		Function<Integer, Integer> addByOneThenMultplyByTen = incrementByOneFunction.andThen(multyplyByTenFunction);
		System.out.println(addByOneThenMultplyByTen.apply(1));
	}

	static Function<Integer, Integer> incrementByOneFunction = number -> number=number+1;
	static Function<Integer, Integer> multyplyByTenFunction = number -> number*=10;
}

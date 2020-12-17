package com;

import java.util.function.Predicate;

public class PredicateApp {
	
	public static void main(String[] args) {
		
		System.out.println("Without predicate");
        System.out.println(isValueValid("07000000000"));
        System.out.println(isValueValid("0700000000"));
        System.out.println(isValueValid("09009877300"));
        System.out.println("With predicate");
        System.out.println(isValueValidPredicate.test("07000000000"));
        System.out.println(isValueValidPredicate.test("0700000000"));
        System.out.println(isValueValidPredicate.test("09009877300"));

		
	}
	
	static Predicate<String> isValueValidPredicate=value->
		value.startsWith("07") && value.length() == 11;
	
	
	static boolean isValueValid(String value) {
        return value.startsWith("07") && value.length() == 11;
    }

}

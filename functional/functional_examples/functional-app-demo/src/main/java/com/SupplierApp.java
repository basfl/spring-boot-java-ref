package com;

import java.util.function.Supplier;

public class SupplierApp {

	public static void main(String[] args) {

		System.out.println(getDBConnectionUrl());
		System.out.println(getDBConnectionUrlsSupplier.get());
	}

	static String getDBConnectionUrl() {
		return "jdbc://localhost:5432/users";
	}

	static Supplier<String> getDBConnectionUrlsSupplier = () -> "jdbc://localhost:5432/users";

}

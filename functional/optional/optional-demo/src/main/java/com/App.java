package com;

import java.util.Optional;

/**
 * Hello world!
 *
 */

class Person {
	private String name;
	private String email;

	public Person(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public Optional<String> getEmail() {
		return Optional.ofNullable(email);
	}

	public String getName() {
		return name;
	}

}

public class App {
	public static void main(String[] args) {
		Optional<String> hello = Optional.ofNullable(null);
		System.out.println(hello.isPresent());
		String orElse = hello.map(ele -> ele.toUpperCase()).orElseGet(() -> {
			///////
			return "world";
		});
		System.out.println(orElse);

//		String orExcept = hello.map(ele -> ele.toUpperCase()).orElseThrow(IllegalArgumentException::new);
//		System.out.println(orExcept);
//		hello.ifPresent((word) -> {
//			System.out.println(word);
//		});
		hello.ifPresent(System.out::println);
		Person person = new Person("p", null);
		System.out.println("***"+person.getEmail().map(String::toUpperCase).orElse("email is null"));

	}
}

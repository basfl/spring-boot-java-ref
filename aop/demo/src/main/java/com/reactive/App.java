package com.reactive;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/**
 * Hello world!
 *
 */
public class App {
	public static String msg;

	public static void main(String[] args) {
		System.out.println("Hello World!");
		Observable<String> observable = Observable.just("how", "to", "do", "in", "java");
		Consumer<String> consume = System.out::println;
		Disposable r = observable.map(w -> w.toUpperCase()).subscribe(consume);
		Observable<String> obs = Observable.just("hi babak");

		obs.subscribe(s -> {
			msg = s;
		});
		System.out.println("this is the result "+msg);
	}
}

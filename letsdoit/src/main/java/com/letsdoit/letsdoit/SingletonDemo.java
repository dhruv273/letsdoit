package com.letsdoit.letsdoit;

public class SingletonDemo {

	private static SingletonDemo obj = new SingletonDemo();

	private SingletonDemo() {

	}

	public static SingletonDemo getInstance() {
		return obj;
	}

	public void showMessage() {
		System.out.println("you are in singleton");
	}
}

package com.letsdoit.letsdoit;

public class SwapNumber {

	public void add(int a, int b) {
		int c = a + b;
		a = c - a;
		b = c - b;
		System.out.println("after swap value of a: " + a + " value of b:" + b);
	}
}

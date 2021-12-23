package com.letsdoit.letsdoit;

public class CheckVowel {
	//sub branch
	public static boolean vowel(String input) {
		return input.toLowerCase().matches("[aeiou]");
	}

	public static void main(String[] args) {

		System.out.println(vowel("dhruv"));
	}
}

package com.letsdoit.letsdoit;

public class ReverseString {

	//This method is use for reversing string 
	public static String reverse(String st) {
		StringBuilder out = new StringBuilder();

		char[] chars = st.toCharArray();

		for (int i = chars.length - 1; i >= 0; i--) {

			out.append(chars[i]);

		}
		return out.toString();
	}

	public static void main(String[] args) {

		System.out.println(reverse("dhruv"));
	}
}

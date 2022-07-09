package org.string;

public class ReverseString {

	public static void main(String[] args) {

		// palindrome method

		// String s = "Rahul";
		String s = "madam";
		String r = "";

		for (int i = s.length() - 1; i >= 0; i--) {

			r = r + s.charAt(i);
		}
		System.out.println(r);
		if (s == r) {
		}
	}
}

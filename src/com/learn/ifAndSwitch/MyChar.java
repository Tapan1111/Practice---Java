package com.learn.ifAndSwitch;

public class MyChar {

	public boolean isVowel(char ch) {

		switch (ch) {
		case 'a', 'e', 'i', 'o', 'u':
		case 'A', 'E', 'I', 'O', 'U':
			return true;

		default:
			throw new IllegalArgumentException("Unexpected value: " + ch);
		}

	}

}

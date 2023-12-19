package com.learn.ifAndSwitch;

public class StringMagic {

	public int countUpperCaseLetters(String str) {
		if (str == null)
			return -1;

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			Character.isUpperCase(str.charAt(i));
			count++;
		}
		return count;

	}

}

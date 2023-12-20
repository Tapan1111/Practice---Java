package com.learn.ifAndSwitch;

public class StringMagic {

	public int countUpperCaseLetters(String str) {

		if (str == null) {
			return -1;
		}

		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				counter++;
			}
		}
		return counter;
	}

	public boolean hasConsecutiveDuplicates(String str) {

		if (str == null) {
			return false;
		}

		for (int i = 0; i < str.length() - 1; i++) {
			char currentCharacter = str.charAt(i);
			char nextCharacter = str.charAt(i + 1);
			if (currentCharacter == nextCharacter) {
				return true;
			}
		}

		return false;
	}

	public int rightMostDigit(String str) {
		if (str == null || str.equals(" ")) {
			return -1;
		}
		int length = str.length();
		for (int i = length - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				return Character.getNumericValue(ch);
			}
		}
		return -1;
	}

	public String findLongestWord(String sentence) {
		if (sentence == null || sentence.equals("")) {
			return "";
		}

		String[] word = sentence.split(" ");
		int maxLength = 0;
		String longestWord = "";
		for (String words : word) {
			if (words.length() > maxLength) {
				maxLength = words.length();
				longestWord = words;
			}
		}
		return longestWord;
	}

}

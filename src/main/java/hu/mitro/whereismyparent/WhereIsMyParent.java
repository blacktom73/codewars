package main.java.hu.mitro.whereismyparent;

import java.util.Arrays;

public class WhereIsMyParent {

	static String findChildren(final String text) {
		if (text.equals("")) {
			return text;
		}
		char[] chars = text.toCharArray();

		int numberOfUppers = 0;
		int numberOfLowers = 0;
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] >= 'A' && chars[i] <= 'Z') {
				numberOfUppers++;
			} else {
				numberOfLowers++;
			}
		}
		char[] upperChars = new char[numberOfUppers];
		char[] lowerChars = new char[numberOfLowers];
		char[] sortedChars = new char[chars.length];

		int upperIndex = -1;
		int lowerIndex = -1;
		int sortedIndex = -1;
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] >= 'A' && chars[i] <= 'Z') {
				upperIndex++;
				upperChars[upperIndex] = chars[i];
			} else {
				lowerIndex++;
				lowerChars[lowerIndex] = chars[i];
			}
		}
		Arrays.sort(upperChars);
		Arrays.sort(lowerChars);
		System.out.println(upperChars);
		System.out.println(lowerChars);
		sortedIndex = -1;
		lowerIndex = 0;
		for (int i = 0; i < upperChars.length; i++) {
			sortedIndex++;
			sortedChars[sortedIndex] = upperChars[i];
			while (sortedIndex < sortedChars.length && lowerIndex < lowerChars.length
					&& lowerChars[lowerIndex + 1] == lowerChars[lowerIndex]) {
				sortedIndex++;
				lowerIndex++;
				sortedChars[sortedIndex] = lowerChars[lowerIndex];
			}
		}
		return String.valueOf(sortedChars);
	}

	public static void main(String[] args) {
		// String inputString = "aAbaBb";
		String inputString = "tluTUlLlJZlIiiiiFfffOoo";
		System.out.println(inputString);
		String resultString = findChildren(inputString);
		System.out.println("Result: " + resultString);
	}

}

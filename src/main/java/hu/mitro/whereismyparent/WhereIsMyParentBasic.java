package main.java.hu.mitro.whereismyparent;

import java.util.Arrays;

/***
 * Mothers arranged dance party for children in school.On that party there are only mothers and
 * their children.All are having great fun on dancing floor when suddenly all lights went out.Its
 * dark night and no one can see eachother.But you were flying nearby and you can see in the dark
 * and have ability to teleport people anywhere you want.
 *
 * Legend: -Uppercase letters stands for mothers,lowercase stand for their children. I.E "A" mothers
 * children are "aaaa". -Function input:String contain only letters,Uppercase letters are unique.
 *
 * Task: Place all people in alphabetical order where Mothers are followed by their children.I.E
 * "aAbaBb" => "AaaBbb".
 *
 * @author Mitró Tamás
 *
 */
public class WhereIsMyParentBasic {

	static String findChildren(final String text) {
		if ("".equals(text)) {
			return "";
		}
		char[] characters = text.toCharArray();
		int numberOfUppers = 0;
		int numberOfLowers = 0;
		for (int i = 0; i < characters.length; i++) {
			if (Character.isUpperCase(characters[i])) {
				numberOfUppers++;
			} else {
				numberOfLowers++;
			}
		}
		char[] upperChars = new char[numberOfUppers];
		char[] lowerChars = new char[numberOfLowers];
		char[] sortedChars = new char[characters.length];

		int upperIndex = -1;
		int lowerIndex = -1;
		int sortedIndex = -1;
		for (int i = 0; i < characters.length; i++) {
			if (Character.isUpperCase(characters[i])) {
				upperIndex++;
				upperChars[upperIndex] = characters[i];
			} else {
				lowerIndex++;
				lowerChars[lowerIndex] = characters[i];
			}
		}
		Arrays.sort(upperChars);
		Arrays.sort(lowerChars);
		System.out.println(upperChars);
		System.out.println(lowerChars);

		sortedIndex = 0;
		lowerIndex = 0;
		int sampleCharIndex = 0;
		if (upperChars[0] == Character.toUpperCase(lowerChars[0])) {
			sortedChars[sortedIndex] = upperChars[0];
			sortedIndex++;
		}
		for (int i = 0; i < upperChars.length; i++) {
			while (lowerIndex < lowerChars.length
					&& lowerChars[sampleCharIndex] == lowerChars[lowerIndex]) {
				sortedChars[sortedIndex] = lowerChars[lowerIndex];
				sortedIndex++;
				lowerIndex++;
			}
			sampleCharIndex = lowerIndex;
		}
		return new String(sortedChars);
	}

	public static void main(String[] args) {
		String inputString = "lldtLDTAtttJCcccGggg";
		System.out.println(inputString);
		String resultString = findChildren(inputString);
		System.out.println("Result: " + resultString);
	}

}

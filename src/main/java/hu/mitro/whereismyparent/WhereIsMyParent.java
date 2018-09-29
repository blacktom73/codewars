package main.java.hu.mitro.whereismyparent;

import java.util.ArrayList;
import java.util.List;

/***
 * Mothers arranged dance party for children in school.On that party there are
 * only mothers and their children.All are having great fun on dancing floor
 * when suddenly all lights went out.Its dark night and no one can see
 * eachother.But you were flying nearby and you can see in the dark and have
 * ability to teleport people anywhere you want.
 *
 * Legend: -Uppercase letters stands for mothers,lowercase stand for their
 * children. I.E "A" mothers children are "aaaa". -Function input:String contain
 * only letters,Uppercase letters are unique.
 *
 * Task: Place all people in alphabetical order where Mothers are followed by
 * their children.I.E "aAbaBb" => "AaaBbb".
 *
 * @author Mitró Tamás
 *
 */
public class WhereIsMyParent {

	static String findChildren(String text) {
		if ("".equals(text)) {
			return text;
		}
		char[] characters = text.toCharArray();
		List<Character> upperChars = new ArrayList<>();
		List<Character> lowerChars = new ArrayList<>();
		separateChars(characters, upperChars, lowerChars);
		List<Character> sortedChars = concatenateLists(upperChars, lowerChars);
		String result = convertToString(sortedChars);
		return result;
	}

	private static String convertToString(List<Character> sortedChars) {
		String result = "";
		for (Character ch : sortedChars) {
			result += ch;
		}
		return result;
	}

	private static void separateChars(char[] characters, List<Character> upperChars, List<Character> lowerChars) {
		for (Character ch : characters) {
			if (Character.isUpperCase(ch)) {
				upperChars.add(ch);
			} else {
				lowerChars.add(ch);
			}
		}
		sortLists(upperChars, lowerChars);
	}

	private static void sortLists(List<Character> upperChars, List<Character> lowerChars) {
		upperChars.sort(null);
		lowerChars.sort(null);
	}

	private static List<Character> concatenateLists(List<Character> upperChars, List<Character> lowerChars) {
		List<Character> resultList = new ArrayList<>();
		int upperIndex = 0;
		int lowerIndex = 0;
		while (upperIndex < upperChars.size()) {
			resultList.add(upperChars.get(upperIndex));
			while (lowerIndex < lowerChars.size()
					&& Character.toUpperCase(lowerChars.get(lowerIndex)) == upperChars.get(upperIndex)) {
				resultList.add(lowerChars.get(lowerIndex));
				lowerIndex++;
			}
			upperIndex++;
		}
		return resultList;
	}

	public static void main(String[] args) {
		System.out.println(findChildren("AaaaaaZzzz"));
	}
}

package main.java.hu.mitro.whereismyparent;

import java.util.ArrayList;
import java.util.List;

public class WhereIsMyParentList {

	static String findChildren(final String text) {

		char[] chars = text.toCharArray();

		List<Character> upperChars = new ArrayList<>();
		List<Character> lowerChars = new ArrayList<>();
		List<Character> sortedChars = new ArrayList<>();
		for (char ch : chars) {
			if (ch >= 'A' && ch <= 'Z') {
				upperChars.add(ch);
			} else {
				lowerChars.add(ch);
			}
		}
		upperChars.sort(null);
		lowerChars.sort(null);

		int index = 0;
		for (char upperChar : upperChars) {
			sortedChars.add(upperChar);
			char nextLowerChar = lowerChars.get(index);
			while (index < lowerChars.size()
					&& lowerChars.get(index).equals(nextLowerChar)) {
				sortedChars.add(lowerChars.get(index));
				index++;
			}
		}

		return sortedChars.toString();
	}

	public static void main(String[] args) {
		String inputString = "aAbaBb";
		String resultString = findChildren(inputString);
		System.out.println(resultString);

	}

}

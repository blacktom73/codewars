package main.java.hu.mitro.whereismyparent;

import java.util.ArrayList;
import java.util.List;

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

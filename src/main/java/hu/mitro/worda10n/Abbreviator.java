package main.java.hu.mitro.worda10n;

/***
 * The word i18n is a common abbreviation of internationalization the developer community use
 * instead of typing the whole word and trying to spell it correctly. Similarly, a11y is an
 * abbreviation of accessibility.
 *
 * Write a function that takes a string and turns any and all "words" (see below) within that string
 * of length 4 or greater into an abbreviation following the same rules.
 *
 * Notes: A "word" is a sequence of alphabetical characters. By this definition, any other character
 * like a space or hyphen (eg. "elephant-ride") will split up a series of letters into two words
 * (eg. "elephant" and "ride"). The abbreviated version of the word should have the first letter,
 * then the number of removed characters, then the last letter (eg. "elephant ride" => "e6t r2e").
 *
 * Example: abbreviate("elephant-rides are really fun!") // ^^^^^^^^*^^^^^*^^^*^^^^^^*^^^* // words
 * (^): "elephant" "rides" "are" "really" "fun" // 123456 123 1 1234 1 // ignore short words: X X
 *
 * // abbreviate: "e6t" "r3s" "are" "r4y" "fun" // all non-word characters (*) remain in place // *
 * "-" " " " " " " "!" === "e6t-r3s are r4y fun!"
 *
 *
 * @author Mitró Tamás
 *
 */
public class Abbreviator {

	public String abbreviate(String string) {
		if (string == null) {
			return null;
		}
		StringBuilder sb = new StringBuilder();
		String[] splittedString = string.split("[^a-zA-Z]");
		int stringSize = 0;
		int positionInString = 0;

		for (String str : splittedString) {
			stringSize = str.length();
			if (stringSize <= 3) {
				sb.append(str);
				if ((positionInString + stringSize) < string.length()) {
					positionInString += stringSize;
					sb.append(string.charAt(positionInString));
					positionInString++;
				}
			} else {
				sb.append(str.charAt(0) + String.valueOf(str.length() - 2)
						+ str.charAt(str.length() - 1));
				if ((positionInString + stringSize) < string.length()) {
					positionInString += stringSize;
					sb.append(string.charAt(positionInString));
					positionInString++;
				}
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Abbreviator abbr = new Abbreviator();
		String testString = "internationalization";
		System.out.println(testString);
		String abbreviatedString = abbr.abbreviate(testString);
		System.out.println(abbreviatedString);
		String testString2 = "elephant-rides are really fun!";
		System.out.println(testString2);
		String abbreviatedString2 = abbr.abbreviate(testString2);
		System.out.println(abbreviatedString2);
	}

}

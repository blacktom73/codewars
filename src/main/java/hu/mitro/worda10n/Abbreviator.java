package main.java.hu.mitro.worda10n;

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

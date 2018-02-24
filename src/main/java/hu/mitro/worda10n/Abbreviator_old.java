package main.java.hu.mitro.worda10n;

public class Abbreviator_old {

	public String abbreviate(String string) {
		if (string == null) {
			return null;
		}
		final char space = ' ';
		final char hyphen = '-';
		int skippedChars = 0;
		int index = 0;
		int innerIndex = 0;
		StringBuilder result = new StringBuilder();
		try {
			while (index < string.length()) {
				if (string.charAt(index) >= 'A' && string.charAt(index) <= 'z') {
					result.append(string.charAt(index));
					innerIndex = index;
					while (innerIndex + 1 < string.length()
							&& string.charAt(innerIndex + 1) != ' '
							&& string.charAt(innerIndex + 1) != '-'
							&& string.charAt(innerIndex + 1) != '!') {
						skippedChars++;
						innerIndex++;
					}
					// ha 3 betûs vagy rövidebb ...
					if (skippedChars == 1) {
						result.append(string.charAt(innerIndex - 1)
								+ string.charAt(innerIndex));
						index = innerIndex + 1;
						continue;
					}
					result.append(String.valueOf(skippedChars - 1));
					result.append(string.charAt(innerIndex));
					index = innerIndex + 1;
					skippedChars = 0;
				} else {
					result.append(string.charAt(index));
					skippedChars = 0;
					index++;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result.toString();
	}

	public static void main(String[] args) {
		Abbreviator_old abbr = new Abbreviator_old();
		// String testString = "internationalization";
		// System.out.println(testString);
		// String abbreviatedString = abbr.abbreviate(testString);
		// System.out.println(abbreviatedString);
		// String testString2 = "elephant-rides are really fun!";
		// String testString2 = "alma-fa-alatt!";
		String testString2 = "fal!";
		System.out.println(testString2);
		String abbreviatedString2 = abbr.abbreviate(testString2);
		System.out.println(abbreviatedString2);
	}

}

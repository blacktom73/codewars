package main.java.hu.mitro.fatfingers;

public class Kata {

	public static String fatFingers(String str) {
		if (null == str) {
			return null;
		}
		char[] chars = str.toCharArray();
		boolean isInvert = false;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == 'a' || chars[i] == 'A') {
				isInvert = !isInvert;
			} else {
				if (isInvert) {
					if (Character.isUpperCase(chars[i])) {
						sb.append(Character.toLowerCase(chars[i]));
					} else {
						sb.append(Character.toUpperCase(chars[i]));
					}
				} else {
					sb.append(chars[i]);
				}
			}
		}
		return sb.toString();
	}

}
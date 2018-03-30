package main.java.hu.mitro.antistring;

public class AntiString {

	public static String antiString(String str) {
		char[] chars = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		String abc = "abcdefghijklmnopqrstuvwxyz";
		for (char c : chars) {
			if (Character.isDigit(c)) {
				char numChar = (char) ((9 - Integer.valueOf(c - 48)) + 48);
				sb.append(numChar);
			} else {
				int position = abc.indexOf(Character.toLowerCase(c));
				char letterChar = abc.charAt(abc.length() - (position + 1));
				if (Character.isLowerCase(c)) {
					sb.append(Character.toUpperCase(letterChar));
				} else {
					sb.append(letterChar);
				}
			}
		}
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		String input = "9Z";
		System.out.println(antiString(input));
	}

}

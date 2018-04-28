package main.java.hu.mitro.tocamelcase;

public class Solution {

	static String toCamelCase(String s) {
		if ("".equals(s)) {
			return s;
		}
		char[] chars = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		sb.append(chars[0]);
		for (int i = 1; i < chars.length; i++) {
			if (chars[i] == '-' || chars[i] == '_') {
				i++;
				sb.append(Character.toUpperCase(chars[i]));
			} else {
				sb.append(chars[i]);
			}
		}
		return sb.toString();
	}

}

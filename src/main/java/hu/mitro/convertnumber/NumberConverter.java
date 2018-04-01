package main.java.hu.mitro.convertnumber;

import java.util.Arrays;

public class NumberConverter {

	public static int[] digitize(long n) {
		StringBuilder numbers = new StringBuilder(String.valueOf(n));
		String reverseNumbers = numbers.reverse().toString();
		char[] resultNumbers = reverseNumbers.toCharArray();
		int[] resultIntNumbers = new int[resultNumbers.length];
		for (int i = 0; i < resultNumbers.length; i++) {
			resultIntNumbers[i] = resultNumbers[i] - 48;
		}
		return resultIntNumbers;
	}

	public static void main(String[] args) {
		long number = 348597;
		int[] reverseNumber = digitize(number);
		System.out.println(Arrays.toString(reverseNumber));
	}

}

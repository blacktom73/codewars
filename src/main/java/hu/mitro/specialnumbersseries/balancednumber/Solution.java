package main.java.hu.mitro.specialnumbersseries.balancednumber;

public class Solution {

	public static String balancedNum(long number) {
		String numberInStringFormat = String.valueOf(number);
		char[] digits = numberInStringFormat.toCharArray();
		int numberOfDigits = digits.length;
		int leftSum = 0, rightSum = 0;
		if (numberOfDigits % 2 == 0) {
			int centralDigitLeft = numberOfDigits / 2 - 1;
			int centralDigitRight = numberOfDigits / 2;
			for (int leftIndex = 0; leftIndex < centralDigitLeft; leftIndex++) {
				leftSum += Integer.valueOf(digits[leftIndex]);
			}
			for (int rigthIndex = numberOfDigits
					- 1; rigthIndex > centralDigitRight; rigthIndex--) {
				rightSum += Integer.valueOf(digits[rigthIndex]);
			}
		} else {
			int centralDigit = numberOfDigits / 2;
			for (int leftIndex = 0; leftIndex < centralDigit; leftIndex++) {
				leftSum += Integer.valueOf(digits[leftIndex]);
			}
			for (int rigthIndex = numberOfDigits
					- 1; rigthIndex > centralDigit; rigthIndex--) {
				rightSum += Integer.valueOf(digits[rigthIndex]);
			}
		}
		return leftSum == rightSum ? "Balanced" : "Not Balanced";
	}

}

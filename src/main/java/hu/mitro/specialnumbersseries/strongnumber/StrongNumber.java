package main.java.hu.mitro.specialnumbersseries.strongnumber;

public class StrongNumber {

	public static String isStrongNumber(int num) {
		String number = Integer.toString(num);
		int[] digits = new int[number.length()];
		for (int i = 0; i < number.length(); i++) {
			digits[i] = number.charAt(i) - '0';
		}
		int sum = 0;
		for (int round = 0; round < digits.length; round++) {
			int factorial = 1;
			for (int i = 1; i <= digits[round]; i++) {
				factorial *= i;
			}
			sum += factorial;
		}
		return sum == num ? "STRONG!!!!" : "Not Strong !!";
	}

}

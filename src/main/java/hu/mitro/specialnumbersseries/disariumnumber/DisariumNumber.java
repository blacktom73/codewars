package main.java.hu.mitro.specialnumbersseries.disariumnumber;

public class DisariumNumber {

	public static String disariumNumber(int number) {
		String numbers = Integer.toString(number);
		int[] digits = new int[numbers.length()];
		for (int i = 0; i < numbers.length(); i++) {
			digits[i] = numbers.charAt(i) - '0';
		}

		int sum = 0;
		for (int j = 0; j < numbers.length(); j++) {
			sum += Math.pow(digits[j], j + 1);
		}
		return sum == number ? "Disarium !!" : "Not !!";
	}

}

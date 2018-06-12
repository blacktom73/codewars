package main.java.hu.mitro.specialnumbersseries.jumpingnumber;

public class JumpingNumber {

	public static String jumpingNumber(int number) {
		String numbers = Integer.toString(number);
		int[] digits = new int[numbers.length()];
		for (int i = 0; i < numbers.length(); i++) {
			digits[i] = numbers.charAt(i) - '0';
		}

		int index = 0;
		while (index < digits.length - 1
				&& Math.abs(digits[index] - digits[index + 1]) == 1) {
			index++;
		}

		return index == digits.length - 1 ? "Jumping!!" : "Not!!";
	}

}

package main.java.hu.mitro.specialnumbersseries.specialnumber;

public class SpecialNumber {

	public static String specialNumber(int number) {
		String numberInStringFormat = Integer.toString(number);
		int[] numbers = new int[numberInStringFormat.length()];
		for (int i = 0; i < numberInStringFormat.length(); i++) {
			numbers[i] = numberInStringFormat.charAt(i) - '0';
			if (numbers[i] > 5) {
				return "NOT!!";
			}
		}
		return "Special!!";
	}

}

package main.java.hu.mitro.specialnumbersseries.automorphic;

public class Automorphic {

	public static String autoMorphic(int number) {
		String numberInStringFormat = Integer.toString(number);
		String squareOfNumber = String.valueOf((int) Math.pow(number, 2));
		char endOfSquare = squareOfNumber.charAt(squareOfNumber.length() - 1);
		char endOfNumber = numberInStringFormat.charAt(numberInStringFormat.length() - 1);
		return endOfSquare == endOfNumber ? "Automorphic" : "Not!!";
	}

}

package main.java.hu.mitro.romannumerals;

enum RomanNumbers {

	I('I', 1),
	V('V', 5),
	X('X', 10),
	L('L', 50),
	C('C', 100),
	D('D', 500),
	M('M', 1000);

	private char number;
	private int value;

	RomanNumbers(char number, int value) {
		this.number = number;
		this.value = value;
	}

	public char getNumber() {
		return number;
	}

	public int getValue() {
		return value;
	}
}

public class Conversion {

	public String solution(int n) {
		StringBuilder resultNumber = new StringBuilder();
		while (n > 0) {
			if (n > 1000) {
				int multiplier = n / 1000;
				n -= RomanNumbers.M.getValue() * multiplier;
				for (int i = 0; i < multiplier; i++) {
					resultNumber.append(RomanNumbers.M);
				}
			} else if (n == 1000) {
				n = appendOneLetter(n, resultNumber);
			} else if (n > 500) {
				int multiplier = n / 500;
				n -= RomanNumbers.D.getValue() * multiplier;
				for (int i = 0; i < multiplier; i++) {
					resultNumber.append(RomanNumbers.D);
				}
			} else if (n == 500) {
				n -= RomanNumbers.D.getValue();
				resultNumber.append(RomanNumbers.D);
			} else if (n > 100) {
				int multiplier = n / 100;
				n -= RomanNumbers.C.getValue() * multiplier;
				for (int i = 0; i < multiplier; i++) {
					resultNumber.append(RomanNumbers.C);
				}
			} else if (n == 100) {
				n -= RomanNumbers.C.getValue();
				resultNumber.append(RomanNumbers.C);
			} else if (n > 50) {
				int multiplier = n / 50;
				n -= RomanNumbers.L.getValue() * multiplier;
				for (int i = 0; i < multiplier; i++) {
					resultNumber.append(RomanNumbers.L);
				}
			} else if (n == 50) {
				n -= RomanNumbers.L.getValue();
				resultNumber.append(RomanNumbers.L);
			} else if (n > 10) {
				int multiplier = n / 10;
				n -= RomanNumbers.X.getValue() * multiplier;
				for (int i = 0; i < multiplier; i++) {
					resultNumber.append(RomanNumbers.X);
				}
			} else if (n == 10) {
				n -= RomanNumbers.X.getValue();
				resultNumber.append(RomanNumbers.X);
			} else if (n > 5) {
				int multiplier = n / 5;
				n -= RomanNumbers.V.getValue() * multiplier;
				for (int i = 0; i < multiplier; i++) {
					resultNumber.append(RomanNumbers.V);
				}
			} else if (n == 5) {
				n -= RomanNumbers.V.getValue();
				resultNumber.append(RomanNumbers.V);
			} else {
				n -= RomanNumbers.I.getValue();
				resultNumber.append(RomanNumbers.I);
			}
		}
		changeRomanFourIfItNeeds(resultNumber);
		return resultNumber.toString();
	}

	private int appendOneLetter(int n, StringBuilder resultNumber) {
		n -= RomanNumbers.M.getValue();
		resultNumber.append(RomanNumbers.M);
		return n;
	}

	private void changeRomanFourIfItNeeds(StringBuilder sb) {
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == RomanNumbers.I.getNumber()) {
				if (i + 3 < sb.length() && sb.charAt(i + 1) == RomanNumbers.I.getNumber()
						&& sb.charAt(i + 2) == RomanNumbers.I.getNumber()
						&& sb.charAt(i + 3) == RomanNumbers.I.getNumber()) {
					sb.delete(i + 2, i + 4);
					sb.setCharAt(i + 1, 'V');
					i = i + 2;
				}
			}
		}
	}

	public static void main(String[] args) {
		int number = 9;
		System.out.println(new Conversion().solution(number));
	}
}
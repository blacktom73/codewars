package main.java.hu.mitro.romannumerals;

enum RomanNumbers {

	M("M", 1000),
	CM("CM", 900),
	D("D", 500),
	CD("CD", 400),
	C("C", 100),
	XC("XC", 90),
	L("L", 50),
	XL("XL", 40),
	X("X", 10),
	IX("IX", 9),
	V("V", 5),
	IV("IV", 4),
	I("I", 1);

	private String romanNumber;
	private int value;

	RomanNumbers(String number, int value) {
		romanNumber = number;
		this.value = value;
	}

	public String getRomanNumber() {
		return romanNumber;
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
				n -= RomanNumbers.M.getValue();
				resultNumber.append(RomanNumbers.M);
			} else if (n > 900) {
				n -= RomanNumbers.CM.getValue();
				resultNumber.append(RomanNumbers.CM);
				int multiplier = n / 100;
				for (int i = 0; i < multiplier; i++) {
					resultNumber.append(RomanNumbers.C);
					n -= RomanNumbers.C.getValue();
				}
			} else if (n == 900) {
				n -= RomanNumbers.CM.getValue();
				resultNumber.append(RomanNumbers.CM);
			} else if (n > 500) {
				n -= RomanNumbers.D.getValue();
				resultNumber.append(RomanNumbers.D);
				int multiplier = n / 100;
				for (int i = 0; i < multiplier; i++) {
					resultNumber.append(RomanNumbers.C);
					n -= RomanNumbers.C.getValue();
				}
			} else if (n == 500) {
				n -= RomanNumbers.D.getValue();
				resultNumber.append(RomanNumbers.D);
			} else if (n > 400) {
				n -= RomanNumbers.CD.getValue();
				resultNumber.append(RomanNumbers.CD);
				int multiplier = n / 100;
				for (int i = 0; i < multiplier; i++) {
					resultNumber.append(RomanNumbers.C);
					n -= RomanNumbers.C.getValue();
				}
			} else if (n == 400) {
				n -= RomanNumbers.CD.getValue();
				resultNumber.append(RomanNumbers.CD);
			} else if (n > 100) {
				int multiplier = n / 100;
				n -= RomanNumbers.C.getValue() * multiplier;
				for (int i = 0; i < multiplier; i++) {
					resultNumber.append(RomanNumbers.C);
				}
			} else if (n == 100) {
				n -= RomanNumbers.C.getValue();
				resultNumber.append(RomanNumbers.C);
			} else if (n > 90) {
				n -= RomanNumbers.XC.getValue();
				resultNumber.append(RomanNumbers.XC);
				int multiplier = n / 10;
				for (int i = 0; i < multiplier; i++) {
					resultNumber.append(RomanNumbers.X);
					n -= RomanNumbers.X.getValue();
				}
			} else if (n == 90) {
				n -= RomanNumbers.XC.getValue();
				resultNumber.append(RomanNumbers.XC);
			} else if (n > 50) {
				n -= RomanNumbers.L.getValue();
				resultNumber.append(RomanNumbers.L);
				int multiplier = n / 10;
				for (int i = 0; i < multiplier; i++) {
					resultNumber.append(RomanNumbers.X);
					n -= RomanNumbers.X.getValue();
				}
			} else if (n == 50) {
				n -= RomanNumbers.L.getValue();
				resultNumber.append(RomanNumbers.L);
			} else if (n > 40) {
				n -= RomanNumbers.XL.getValue();
				resultNumber.append(RomanNumbers.XL);
				int multiplier = n / 10;
				for (int i = 0; i < multiplier; i++) {
					resultNumber.append(RomanNumbers.X);
					n -= RomanNumbers.X.getValue();
				}
			} else if (n == 40) {
				n -= RomanNumbers.XL.getValue();
				resultNumber.append(RomanNumbers.XL);
			} else if (n > 10) {
				int multiplier = n / 10;
				n -= RomanNumbers.X.getValue() * multiplier;
				for (int i = 0; i < multiplier; i++) {
					resultNumber.append(RomanNumbers.X);
				}
			} else if (n == 10) {
				n -= RomanNumbers.X.getValue();
				resultNumber.append(RomanNumbers.X);
			} else if (n == 9) {
				n -= RomanNumbers.IX.getValue();
				resultNumber.append(RomanNumbers.IX);
			} else if (n > 5) {
				n -= RomanNumbers.V.getValue();
				resultNumber.append(RomanNumbers.V);
				int multiplier = n / 1;
				for (int i = 0; i < multiplier; i++) {
					resultNumber.append(RomanNumbers.I);
					n -= RomanNumbers.I.getValue();
				}
			} else if (n == 5) {
				n -= RomanNumbers.V.getValue();
				resultNumber.append(RomanNumbers.V);
			} else if (n == 4) {
				n -= RomanNumbers.IV.getValue();
				resultNumber.append(RomanNumbers.IV);
			} else {
				n -= RomanNumbers.I.getValue();
				resultNumber.append(RomanNumbers.I);
			}
		}
		return resultNumber.toString();
	}

	public static void main(String[] args) {
		int number = 48;
		System.out.println(new Conversion().solution(number));
	}
}

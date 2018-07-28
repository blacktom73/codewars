package romannumerals;

enum RomanNumbers {

	I("I", 1),
	V("V", 5),
	X("X", 10),
	L("L", 50),
	C("C", 100),
	D("D", 500),
	M("M", 1000);

	private String number;
	private int value;

	RomanNumbers(String number, int value) {
		this.number = number;
		this.value = value;
	}

	public String getNumber() {
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
				n -= RomanNumbers.M.getValue();
				resultNumber.append(RomanNumbers.M);
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
		return resultNumber.toString();
	}

	public static void main(String[] args) {
		int number = 1666;
		System.out.println(new Conversion().solution(number));
	}
}

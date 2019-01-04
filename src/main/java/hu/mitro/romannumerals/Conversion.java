package main.java.hu.mitro.romannumerals;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;


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
		int multiplier = 0;
		StringBuilder resultNumber = new StringBuilder();
		RomanNumbers[] romanNumbers = RomanNumbers.values();

		for (RomanNumbers romanNumber : romanNumbers) {
			multiplier = n / romanNumber.getValue();
			n -= romanNumber.getValue() * multiplier;
			for (int x = 0; x < multiplier; x++) {
				resultNumber.append(romanNumber.getRomanNumber());
			}
		}

		return resultNumber.toString();
	}

	public static void main(String[] args) {
		int number = 1984;
		System.out.println(new Conversion().solution(number));
	}
}

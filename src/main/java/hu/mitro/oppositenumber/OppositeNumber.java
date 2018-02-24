package main.java.hu.mitro.oppositenumber;

public class OppositeNumber {

	public static int Opposite(int number) {
		return number * -1;
	}

	public static void main(String[] args) {
		System.out.println(Opposite(1));
		System.out.println(Opposite(14));
		System.out.println(Opposite(-34));
	}

}

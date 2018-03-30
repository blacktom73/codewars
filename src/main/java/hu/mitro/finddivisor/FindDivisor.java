package main.java.hu.mitro.finddivisor;

public class FindDivisor {

	public static long numberOfDivisors(int n) {
		long divisors = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				divisors++;
			}
		}
		return divisors;
	}

	public static void main(String[] args) {
		long divs = numberOfDivisors(30);
		System.out.println(divs);
	}

}

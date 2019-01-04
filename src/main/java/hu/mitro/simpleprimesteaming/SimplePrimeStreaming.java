package main.java.hu.mitro.simpleprimesteaming;

public class SimplePrimeStreaming {

	static String number;

	public static String solve(int a, int b) {
		char[] digits = number.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < b; i++) {
			sb.append(digits[a]);
			a++;
		}
		return sb.toString();
	}

	public static void generatePrimes() {
		StringBuilder primeBuilder = new StringBuilder();
		int possiblePrime = 2;
		int desiredLength = 20006;
		while (primeBuilder.length() < desiredLength) {
			if (isPrime(possiblePrime)) {
				primeBuilder.append(possiblePrime);
			}
			possiblePrime++;
		}
		number = primeBuilder.toString();
	}

	private static boolean isPrime(int number) {
		int dividers = 0;
		for (int x = 1; x <= number; x++) {
			if (number % x == 0) {
				dividers++;
			}
			if (dividers > 2){
				return false;
			}
		}
		return dividers == 2 ? true : false;
	}

}

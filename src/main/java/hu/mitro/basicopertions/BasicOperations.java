package main.java.hu.mitro.basicopertions;

public class BasicOperations {

	public static Integer basicMath(String op, int v1, int v2) {
		Integer result = null;
		switch (op) {
			case "+":
				result = v1 + v2;
				break;
			case "-":
				result = v1 - v2;
				break;
			case "*":
				result = v1 * v2;
				break;
			case "/":
				result = v1 / v2;
				break;
			default:
				break;
		}
		return result;
	}

	public static void main(String[] args) {
		Integer r1 = basicMath("+", 4, 7); // Output: 11
		System.out.println(r1);
		Integer r2 = basicMath("-", 15, 18); // Output: -3
		System.out.println(r2);
		Integer r3 = basicMath("*", 5, 5); // Output: 25
		System.out.println(r3);
		Integer r4 = basicMath("/", 49, 7); // Output: 7
		System.out.println(r4);
	}

}

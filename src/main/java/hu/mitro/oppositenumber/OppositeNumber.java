package main.java.hu.mitro.oppositenumber;

/***
 *
 * @author Mitró Tamás Very simple, given a number, find its opposite.
 *
 *         Examples: 1: -1 14: -14 -34: 34
 *
 *         But can you do it in 1 line of code and without any conditionals?
 *
 */
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

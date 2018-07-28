package main.java.hu.mitro.dinglemouse;

/***
 * Given number A you must return number B so that (int) (A + B) == 123
 *
 * Note B can't be negative :-)
 *
 * @author Mitró Tamás
 *
 */
public class Dinglemouse {

	public static long int123(final int a) {
		return (long) 123 - a;
	}

	public static void main(String[] args) {
		int a = 500;
		final long b = Dinglemouse.int123(a);
		System.out.println("" + a + " + " + b + " = " + (int) (a + b));
	}
}

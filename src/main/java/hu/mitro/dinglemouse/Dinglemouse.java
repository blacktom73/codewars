package main.java.hu.mitro.dinglemouse;

/***
 * Given number A you must return number B so that (int) (A + B) == 123
 *
 * Note B can't be negative
 *
 * @author Mitr� Tam�s
 *
 */
public class Dinglemouse {

	public static long int123(final int a) {
		int b = 0;
		b = 123 - a;
		return b;
	}

}

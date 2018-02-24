package main.java.hu.mitro.getntheven;

/***
 * Return the Nth Even Number
 *
 * nthEven(1) //=> 0, the first even number is 0 nthEven(3) //=> 4, the 3rd even number is 4 (0, 2,
 * 4)
 *
 * nthEven(100) //=> 198 nthEven(1298734) //=> 2597466
 *
 * The input will not be 0.
 *
 * Hint: Think Math
 * 
 * @author Mitró Tamás
 *
 */
public class Num {

	public static int nthEven(int n) {
		if (n < 1) {
			return -1;
		}
		int result = 0;
		for (int i = 1; i < n; i++) {
			result += 2;
		}
		return result;
	}

}

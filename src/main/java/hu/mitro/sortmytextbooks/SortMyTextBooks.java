package main.java.hu.mitro.sortmytextbooks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/***
 *
 * @author Mitró Tamás HELP! Jason can't find his textbook! It is two days before the test date, and
 *         Jason's textbooks are all out of order! Help him sort a list (ArrayList in java) full of
 *         textbooks by subject, so he can study before the test.
 * 
 *         The sorting should NOT be case sensitive
 * 
 */
public class SortMyTextBooks {

	public static List<String> sort(List<String> textbooks) {
		Collections.sort(textbooks, String.CASE_INSENSITIVE_ORDER);
		return textbooks;
	}

	public static void main(String[] args) {
		ArrayList<String> strs = new ArrayList<>();
		for (String s : new String[] { "Algebra", "history", "Geometry", "english" }) {
			strs.add(s);
		}
		System.out.println(sort(strs));
	}
}

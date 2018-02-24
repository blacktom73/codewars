package main.java.hu.mitro.sortmytextbooks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

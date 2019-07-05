package main.java.hu.mitro.flattenandsortarray;

import java.util.Arrays;
import java.util.stream.IntStream;


public class Kata {

	public static int[] flattenAndSort(int[][] array) {
		IntStream stream = Arrays.stream(array).flatMapToInt(x -> Arrays.stream(x));
		return stream.sorted().toArray();
	}
}

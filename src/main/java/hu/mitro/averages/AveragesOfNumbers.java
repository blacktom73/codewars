package main.java.hu.mitro.averages;

import java.util.Arrays;

public class AveragesOfNumbers {

	public static double[] averages(int[] numbers) {
		if (numbers == null || numbers.length == 0 || numbers.length == 1) {
			return new double[0];
		}
		double average;
		double[] averages = new double[numbers.length - 1];
		for (int i = 0; i < numbers.length - 1; i++) {
			average = (Double.valueOf(numbers[i]) + numbers[i + 1]) / 2;
			averages[i] = average;
		}
		return averages;
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 3, 5, 1, -10 };
		double[] avgs = averages(numbers);
		System.out.println(Arrays.toString(avgs));
	}

}

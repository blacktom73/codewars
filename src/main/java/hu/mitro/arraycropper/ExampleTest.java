package main.java.hu.mitro.arraycropper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExampleTest {
	@Test
	public void test() {
		int[][][] example = {
				{ { 0, 1, 0, 0 }, { 0, 0, 1, 0 }, { 1, 1, 1, 0 }, { 0, 0, 0, 0 } },
				{ { 0, 1, 0 }, { 0, 0, 1 }, { 1, 1, 1 } } };
		int[][] res = ArrayCropper.getCroppedFieldAsArray(example[0]);
		assertEquals(example[1], res);
	}
}
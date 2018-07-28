package main.java.hu.mitro.whereismyparent;

import org.junit.Assert;
import org.junit.Test;

public class WhereIsMyParentTest {

	private static void test(final String expected, final String input) {
		Assert.assertEquals("For input \"" + input + '"', expected,
				WhereIsMyParent.findChildren(input));
	}

	@Test
	public void basicTests() {
		test("AaBb", "abBA");
		test("AaaaaaZzzz", "AaaaaZazzz");
		test("AaBbbCcc", "CbcBcbaA");
		test("FfUuuuXx", "xXfuUuuF");
		test("", "");
	}

}

package main.java.hu.mitro.firstclass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FirstClassTest {

	@Test
	public void testSum() throws Exception {
		byte a = 1;
		byte b = 2;
		assertEquals(3, FirstClass.sum(a, b));
	}

}

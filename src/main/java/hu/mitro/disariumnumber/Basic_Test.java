package main.java.hu.mitro.disariumnumber;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Basic_Test {

	@Test
	public void Disarium_Or_NOT() {
		assertEquals("Disarium !!", DisariumNumber.disariumNumber(89));
		assertEquals("Not !!", DisariumNumber.disariumNumber(564));
		assertEquals("Not !!", DisariumNumber.disariumNumber(1024));
	}

	@Test
	public void Larger_Numbers() {
		assertEquals("Not !!", DisariumNumber.disariumNumber(64599));
		assertEquals("Not !!", DisariumNumber.disariumNumber(136586));
		assertEquals("Not !!", DisariumNumber.disariumNumber(1048576));
	}

}

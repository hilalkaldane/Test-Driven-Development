package com.hk97.incubyte.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAddition {
	@Test
	public void testAddition() {
		assertEquals(0, Main.add(""));
		assertEquals(5,Main.add("1,4"));
		assertEquals(6,Main.add("1,2\n3"));
	}
}

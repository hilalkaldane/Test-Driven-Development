package com.hk97.incubyte.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAddition {
	@Test
	public void testAddition() {
		Main main= new Main();
		assertEquals(0,main.add(""));
		assertEquals(5,main.add("1,4"));
		assertEquals(6,main.add("1,2\n3"));
		assertEquals(6,main.add("//;\n1;2;3"));
		assertEquals(0,main.add("//;\n1;-2;3"));
		assertEquals(2000,main.add("1000,1000,1001"));
		assertEquals(2000,main.add("1000,1000\n1001"));
		assertEquals(2000,main.add("//~\n1000~1000~1001"));
		assertEquals(0,main.add("//~\n1000~-1000~1001"));


	}
}

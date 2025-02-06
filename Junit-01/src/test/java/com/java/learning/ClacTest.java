package com.java.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClacTest {

	@Test
	void test() {
		Clac c=new Clac();
		int actual=c.divide(15, 6);
		int expected=2;
		assertEquals(expected,actual);
	}

}

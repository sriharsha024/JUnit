package com.java.learning;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseTest {
	Reverse r=new Reverse();
	@Test
	void testReverseString_OneWord() {
		assertEquals("skcurT",r.rev("Trucks"));
	}
	@Test
	void testReverseString_MultipleWord() {
		assertEquals(".roloc der si raC",r.rev("Car is red color."));
	}

}

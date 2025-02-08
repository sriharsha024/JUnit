package com.java.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ShapesTestTrail {

	@Test
	void test() {
		assertEquals(24,24);
	}
	
	@Test
	void testComputeSquareArea() {
		Shapes shape=new Shapes();
		assertEquals(576,shape.computeSquareArea(24));
	}

}
package com.java.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {
	Shapes shape=new Shapes();
	@Test
	void testComputeSquareArea_not() {
		assertNotEquals(575,Shapes.computeSquareArea(24));
	}
	@Test
	void testComputeSquareArea_not_withMsg() {
		assertNotEquals(575,Shapes.computeSquareArea(24),"Both actual and expected are same");
	}
	@Test
	void testComputeSquareArea_not_withSupplier() {
		assertNotEquals(575.5,Shapes.computeSquareArea(24),()-> "Both actual and expected are same");
	}

}

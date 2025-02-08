package com.java.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {
	Shapes shape=new Shapes();
	@Test
	void testComputeSquareArea() {
		assertEquals(576,Shapes.computeSquareArea(24));
	}
	@Test
	void testComputeCircleArea() {
		assertEquals(314,Shapes.computeCircleArea(10),"Area of circle");
	}
	@Test
	void testComputeCircleArea_Supplier() {//efficient way
		assertEquals(314,Shapes.computeCircleArea(10),()-> "Area of circle");
	}
	

}

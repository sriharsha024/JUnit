package com.java.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShapesTestBeforeEach {
	Shapes shape;
	@BeforeEach
	void init() {
		shape=new Shapes();
		System.out.println("In Before Each");
	}
	@AfterEach
	void fin() {
		System.out.println("In After Each");
	}
	@Test
	void testComputeSquareArea() {
		assertEquals(576,Shapes.computeSquareArea(24));
		System.out.println("In Square");
	}
	@Test
	void testComputeCircleArea() {
		assertEquals(314,Shapes.computeCircleArea(10),"Area of circle");
		System.out.println("In Circle");
	}

}

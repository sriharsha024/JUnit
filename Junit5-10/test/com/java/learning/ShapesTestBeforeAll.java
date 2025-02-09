package com.java.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ShapesTestBeforeAll {
	ShapesTestBeforeAll(){
		System.out.println("In Shapes All");
	}
	@BeforeAll
	static void bef() {
		System.out.println("In Before All");
	}
	@AfterAll
	static void aft() {
		System.out.println("In After All");
	}
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

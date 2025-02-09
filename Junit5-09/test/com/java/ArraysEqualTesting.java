package com.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArraysEqualTesting {

	@Test
	void testArrays() {
		int expect[]={2,3,5,6};
		int actual[]={2,3,5,6};
		assertArrayEquals(expect,actual);
	}

}

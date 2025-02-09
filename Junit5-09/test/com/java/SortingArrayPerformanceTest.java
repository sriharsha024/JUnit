package com.java;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;

class SortingArrayPerformanceTest {

	@Test
	void testPerformance() {
		SortingArray ac=new SortingArray(); 
		int unsort[]= {9,5,1,2,4,7};
		assertTimeout(Duration.ofNanos(10),()->ac.sortingArray(unsort));
	}

}

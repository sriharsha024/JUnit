package com.java;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortingArrayTest {

	@Test
	void testArray() {
		SortingArray ac=new SortingArray(); 
		try {
			int unsort[]= null;
			int sorted[]=ac.sortingArray(unsort);
			for(int i:sorted) {
				System.out.println(i);
			}
			System.out.println("Statements below Exception");
			fail();
		}
		catch(NullPointerException e) {
			System.out.println("Exception generated");
		}
		
		//another method is 
		int unsort1[]= null;
		assertThrows(NullPointerException.class,()->ac.sortingArray(unsort1));
		
	}

}

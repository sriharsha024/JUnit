package com.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.java.service.PurchaseCourse;
import com.learning.doa.*;

class TestPurchaseCourse {
	
	@Test
	void testproceedWithCourse() {
		PurchaseCourse c=new PurchaseCourse();
		assertTrue(c.proceedWithCourse(new JunitCourse()),"It is returning false");
		//assertFalse(c.proceedWithCourse(new JunitCourse()));
	}

}

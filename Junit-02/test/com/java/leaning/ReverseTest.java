package com.java.leaning;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseTest {
		// Junit 4
	@Test
	public void test() {
		Reverse r=new Reverse();
		assertEquals("BOOT",r.rev("TOOB"));
		assertEquals("Practice",r.rev("ecitcarp"));
		assertEquals("Java",r.rev("avaJ"));
	}

}

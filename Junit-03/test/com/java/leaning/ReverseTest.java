package com.java.leaning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseTest {
		//Junit 5
	@Test
	void test() {
		Reverse r=new Reverse();
		assertEquals("gnirpS",r.rev("Spring"));
		assertEquals("etiuSlooT",r.rev("ToolSuite"));
		assertEquals("Java",r.rev("avaJ"));
	}

}

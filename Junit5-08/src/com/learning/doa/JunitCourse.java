package com.learning.doa;

public class JunitCourse implements Course {
	@Override
	public boolean coursePurchased() {
		System.out.println("Junit course purchased");
		return true;
	}
}

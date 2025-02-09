package com.java.service;
import  com.learning.doa.Course;
public class PurchaseCourse {
	private Course course;
	
	public boolean proceedWithCourse(Course course) {
		return course.coursePurchased();
	}

}

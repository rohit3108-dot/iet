package com.demo.test;

import java.time.LocalDate;

import com.demo.bean.GraduateStudent;
import com.demo.bean.MasterStudent;

	public class TestInheritance 
	{
	public static void main(String[] args) {

			GraduateStudent g = new GraduateStudent(45, "xxx", "Kolkata", LocalDate.of(2000, 04, 27), new int[] { 45, 34 },
					89);
			System.out.println(g);
			System.out.println("Grade: " + g.calculateGrade());
			MasterStudent m = new MasterStudent(54, "xxx", "Kolkata", LocalDate.of(2000, 04, 27), new int[] { 47, 34 }, "yyyy",
					"BSC", 89);
			System.out.println(m);
			System.out.println("Grade: " + m.calculateGrade());
		
		}
	}
	
	
package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeAndAfterAnnotation {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}

	@Before
	public void before() {
		System.out.println("Before Test Excecutes");
	}
	
	@Test
	public void task1() {
		System.out.println("Task1 Excecuted");
	}

	@Test
	public void task2() {
		System.out.println("Task2 Excecuted");
	}
	@After
	public void after() {
		System.out.println("After Test Excecutes");
	}
	
	@org.junit.AfterClass
	public static void AfterClass() {
		System.out.println("After Class");
	}

}

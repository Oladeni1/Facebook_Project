package com.JavaProjectEx;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JunitAnnotations {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeClass: Setup Environment");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("AfterClass: Print test complete");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Setup: Set browser and Url");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("TearDown: Close browser after each test");
	}

	@Test
	void test1() {
		System.out.println("Run: Test1");
	}

	@Test
	void test2() {
		System.out.println("Run: Test2");
	}

}

package week9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDMV {

	@Test
	void test() {
		System.out.println("Testing for DMV");
		assert(DMV.expirationDate(2014) != 2024) : "Test has not passed.";
		assert(DMV.expirationDate(2014) != 2023) : "Test has not passed.";
	}

	@Test
	void test2() {
		
	}
}

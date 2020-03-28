package com.epam.TddandJunit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class Task {
	/*
	 * char1 ABCD => BCD
	 * char2 AACD => CD
	 * char3 BACD => BCD
	 * char4 BBAA => BBAA
	 * char5 AABAA => BAA 
	 */
	CheckingAInFirstTwoCharacters  checkingAInFirstTwoCharacters;
	
	@BeforeEach
	void setUp(){
		checkingAInFirstTwoCharacters = new CheckingAInFirstTwoCharacters();
	}

	@Test
	void testingAInFirstCharacter() {
		assertEquals("BCD",checkingAInFirstTwoCharacters.skip("ABCD"));
	}
	@Test
	void testingAInFirstTwoCharacters() {
		assertEquals("CD",checkingAInFirstTwoCharacters.skip("AACD"));
	}
	@Test
	void testingAInSecondCharacter() {
		assertEquals("BCD",checkingAInFirstTwoCharacters.skip("BACD"));
	}
	@Test
	void testingANotInFirstTwoCharacters() {
		assertEquals("BBAA",checkingAInFirstTwoCharacters.skip("BBAA"));
	}
	@Test
	void testingBothAInFirstTwoCharacters() {
		assertEquals("BAA",checkingAInFirstTwoCharacters.skip("AABAA"));
	}
	

}

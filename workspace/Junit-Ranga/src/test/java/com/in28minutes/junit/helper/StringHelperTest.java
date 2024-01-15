package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {
	StringHelper sh = new StringHelper();

	@Test
	public void testtruncateAInFirst2Positions_AinFirst2Positions() {
		assertEquals("CD", sh.truncateAInFirst2Positions("AACD"));

	}

	@Test
	public void testtruncateAInFirst2Positions_AinFirstPositions() {
		assertEquals("", sh.truncateAInFirst2Positions("AA"));

	}
	
	@Test
	public void areFirstAndLastTwoCharactersTheSame_NegativeScenario() {
		assertEquals(false, sh.areFirstAndLastTwoCharactersTheSame("ABCD"));
//OR
		assertFalse(sh.areFirstAndLastTwoCharactersTheSame("AABB"));

	}
	
	@Test
	public void areFirstAndLastTwoCharactersTheSame_PositiveScenario() {
		assertTrue(sh.areFirstAndLastTwoCharactersTheSame("ABAB"));

	}
	
	

}

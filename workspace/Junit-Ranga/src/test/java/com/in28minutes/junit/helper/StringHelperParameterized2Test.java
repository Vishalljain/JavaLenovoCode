package com.in28minutes.junit.helper;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterized2Test {

	StringHelper strhelper = new StringHelper();
	private String input;
	private boolean expectedOutput;

	public StringHelperParameterized2Test(String input, boolean expectedOutput) {
		this.input = input;
		this.expectedOutput = expectedOutput;

	}

	@Parameters
	public static Collection<Object[]> testConditions() {
		Object expectedOutputs[][] = new Object[][] { { "ABAB", true }, { "ACD", false }, { "AC", true } };
		return Arrays.asList(expectedOutputs);

	}

	@Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
    assertEquals(expectedOutput, strhelper.areFirstAndLastTwoCharactersTheSame(input));

	}

}
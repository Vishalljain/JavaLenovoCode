package com.in28minutes.junit.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterized3Test {
		StringHelper helper = new StringHelper();
		String input;
	 
		public StringHelperParameterized3Test(String input) {
			this.input = input;
			
		}
	 
		@Parameters
		public static Collection<String[]> testConditions() {
		String[][] parameters = {{"AAAA"},{"FA"},{"CA"},{"CDCD"}};
			return Arrays.asList(parameters);
		}
	 
		@Test
		public void testAreFirstAndLastTwoCharactersTheSame() {
			
			assertTrue(helper.areFirstAndLastTwoCharactersTheSame(input));
	 
		}
	}

	

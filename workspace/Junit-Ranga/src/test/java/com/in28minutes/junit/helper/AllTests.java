package com.in28minutes.junit.helper;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ StringHelperParameterized2Test.class, StringHelperParameterized3Test.class,
		StringHelperTestParametrized.class })
public class AllTests {

}

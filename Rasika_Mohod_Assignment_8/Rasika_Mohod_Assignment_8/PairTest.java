package com.gmu.rmohod;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This is a JUnit Test class for implementation of Class Pair
 * This class has two different types of Test cases to verify the operations on Pair class
 * 
 * @author Rasika
 */

public class PairTest {

	@Test
	public void test1() throws Exception {
		Pair<Integer, String> p1 = new Pair<>(4400,"University Drive");
		
		String actualPair = p1.toString();
		String expectedPair = "<4400,University Drive>";
		assertEquals(actualPair, expectedPair);
	}
	@Test
	public void test2() {
		Pair<String, String> p2 = new Pair<String, String>();
		p2.setFirstElement("George Mason Univerity");
		p2.setSecondElement("Fairfax Campus");
		
		String actualPair = p2.toString();
		String expectedPair = "<George Mason Univerity,Fairfax Campus>";
		assertEquals(actualPair, expectedPair);
	}
}

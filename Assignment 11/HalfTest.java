package com.gmu.rmohod;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
/**
 * This is a JUnit Test class for implementation of Class HalfClient
 * This class has two different types of Test cases to verify the operations on HalfClient class
 * 
 * @author Rasika
 *
 */
public class HalfTest {

	@Test
	/**
	 * Test to check the operation of class HalfClient and Half with positive integers
	 * 
	 */
	public void test1() {
		int[] array= {2,5,1,4,70};
		int[] newArray = HalfClient.makeHalf(array);
		String actualarray = Arrays.toString(newArray);
		String expectedarray = "[1, 2, 0, 2, 35]";
		assertEquals(actualarray, expectedarray);
	}
	@Test
	/**
	 * Test to check the operation of class HalfClient and Half with positive & negative integers
	 * 
	 */
	public void test2() {
		int[] array= {-5,44,-1,89,7,34,10900};
		int[] newArray = HalfClient.makeHalf(array);
		String actualarray = Arrays.toString(newArray);
		String expectedarray = "[-2, 22, 0, 44, 3, 17, 5450]";
		assertEquals(actualarray, expectedarray);
	}

}

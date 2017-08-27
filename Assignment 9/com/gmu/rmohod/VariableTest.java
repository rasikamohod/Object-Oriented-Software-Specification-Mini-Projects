package com.gmu.rmohod;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This is a JUnit Test class for implementation of Class Variable
 * This class has two different types of Test cases to verify the operations on Variable class
 * 
 * @author Rasika
 *
 */
public class VariableTest {

	@Test
	/**
	 * Test to check the operation of class Variable with variables of type Integer 
	 * 
	 */
	public void test1() throws Exception {
		Variable<Integer> v11= new Variable<>(10);
		Variable<Integer> v12= new Variable<>(100);
		v11.swap(v12);
		
		String actualswapedv11 = v11.toString();
		String expectedswapedv11 = "100";
		assertEquals(actualswapedv11, expectedswapedv11);
		
		String actualswapedv12 = v12.toString();
		String expectedswapedv12 = "10";
		assertEquals(actualswapedv12, expectedswapedv12);
	}
	
	@Test
	/**
	 *  Test to check the operation of class Variable with variables of type String 
	 *
	 */
	public void test2() throws Exception {
		Variable<String> v21= new Variable<>();
		v21.setValue("Hi!");
		Variable<String> v22= new Variable<>();
		v22.setValue("Bye!");
		v21.swap(v22);
		
		String actualswapedv21 = v21.toString();
		String expectedswapedv21 = "Bye!";
		assertEquals(actualswapedv21, expectedswapedv21);
		
		String actualswapedv22 = v22.toString();
		String expectedswapedv22 = "Hi!";
		assertEquals(actualswapedv22, expectedswapedv22);
	}

}

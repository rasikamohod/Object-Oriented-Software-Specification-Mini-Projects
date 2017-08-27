package com.gmu.rmohod;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntSetTest {

	@Test
	//Test case written with duplicate elements as input
	public void test1() {
		IntSet intset = new IntSet();
		int[] elsArray2={1,45,-9,56,34,45};
		for(int i=0;i<elsArray2.length;i++)
		{
			intset.insert(elsArray2[i]);
		}
		String actualSetString = intset.toString();
		String expectedSetString = " [-9, 1, 34, 45, 56] ";
		assertEquals(expectedSetString, actualSetString);
	}
	@Test
	//Test case written with all valid elements as input
	public void test2() {
		IntSet intset = new IntSet();
		int[] elsArray2={10,45,9,-99,6,33,-8};
		for(int i=0;i<elsArray2.length;i++)
		{
			intset.insert(elsArray2[i]);
		}
		String actualSetString = intset.toString();
		String expectedSetString = " [-99, -8, 6, 9, 10, 33, 45] ";
		assertEquals(expectedSetString, actualSetString);
	}

}

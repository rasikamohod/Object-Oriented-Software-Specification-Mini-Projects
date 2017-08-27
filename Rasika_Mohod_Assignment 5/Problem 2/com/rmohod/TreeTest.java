package com.rmohod;

import static org.junit.Assert.*;

import java.util.InputMismatchException;

import org.junit.Test;

public class TreeTest {

	@Test
	public void test1() throws Exception 
	{
		Tree tree = new Tree(1);
		int[] treeArray1={10,45,9,-99,6,33,-8};
		for(int i=0;i<treeArray1.length;i++)
		{
			try 
			{
				//Take next integer to be input from user
				tree.add(Integer.valueOf(treeArray1[i]));
			}
			catch (InputMismatchException inputMismatchException){
				System.err.printf("\nException: %s\n", inputMismatchException);
			}
			catch (Exception e)
			{
				System.out.println("\n"+e+" For integer "+treeArray1[i]);
			}
		}
		String actualInOrderString = tree.inOrder();
		String expectedInOrderString = " [-99, -8, 1, 6, 9, 10, 33, 45] ";
		assertEquals(expectedInOrderString, actualInOrderString);
	}
	
	@Test
	public void test2() throws Exception 
	{
		Tree tree = new Tree(2);
		int[] treeArray2={1,45,-9,56,34,45};
		for(int i=0;i<treeArray2.length;i++)
		{
			try 
			{
				//Take next integer to be input from user
				tree.add(Integer.valueOf(treeArray2[i]));
			}
			catch (InputMismatchException inputMismatchException){
				System.err.printf("\nException: %s\n", inputMismatchException);
			}
			catch (Exception e)
			{
				System.out.println("\n"+e+" For integer "+treeArray2[i]);
			}
		}
		String actualInOrderString = tree.inOrder();
		String expectedInOrderString = " [-9, 1, 2, 34, 45, 56] ";
		assertEquals(expectedInOrderString, actualInOrderString);
	}
}

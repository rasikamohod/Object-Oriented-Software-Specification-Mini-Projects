package com.rmohod;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Tree {
	/*
	 * This class represents the Tree.
	 * 
	 * Specification fields
	 *  Tnode(mVal,mLeft,mRight) is a node of a tree with value v, left sub-node l, right sub-node r
	 *  @ mVal   : The value of the node of the tree
	 *  @ mLeft  : The left sub-node
	 *	@ mRight : The right sub-node
	 *
	 */
	
	 /* Abstraction Function:
	  * AF(c) = a Tree t,
	  * where Tnode(mVal,mLeft,mRight) is a node of a tree 
	  * 	  with value v, left sub-node l, right sub-node r 
	  *       
	  * Representation Invariant:
	  * (mLeft.mVal < mVal < mRight.mVal)
	  * Left sub-node value should be less than the parent node 
	  * and parent node value should be less than the right sub-node value 
	  * 
	  */
	
	public final int mVal;
	public Tree mLeft;
	public Tree mRight;
	
	//Constructor
	public Tree(int val) 
	{
		//EFFECTS: Initializes the tree node value
		
		mVal = val;
	}
	
	//Methods
	
	/*
	 * @throws: Exception ("Duplicate value exception.") if a duplicate entry if input to be added in Tree
	 */
	public void add(int val) throws Exception 
	{
		//EFFECTS: Initializes the tree node value to the input value 
		           //and throws exception if a duplicate entry if input to be added in Tree
		//MODIFIES: Modifies this (the value in the tree, so as to maintain the sorted order: mLeft < mVal < mRight)
		
		if (val < mVal) 
		{
			if (mLeft == null)
				mLeft = new Tree(val);
			else
				mLeft.add(val);
		} 
		else if (val > mVal) 
		{
			if (mRight == null)
				mRight = new Tree(val);
			else
				mRight.add(val);
		}
		else
		{
			Exception e = new Exception ("Duplicate value exception.");
			throw e;
		}
	}
	
	public String inOrder() throws Exception 
	{
		//EFFECTS: returns the the values of the Tree nodes in order (from left most sub node to the right most sub-node)
		//REQUIRES: the Tree should not be modified while using the current iterator
		
		TreeIterator treeIterator = new TreeIterator(this); 
		String orderedList = "";
		ArrayList<Integer> results = new ArrayList<Integer>();
		
		while (treeIterator.hasNext())
		{
			results.add(treeIterator.next());
		}
		
		orderedList = " "+results+" ";
		return orderedList;
	}
}
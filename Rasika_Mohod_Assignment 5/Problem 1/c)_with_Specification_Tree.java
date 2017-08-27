package com.rmohod;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tree {
	/*
	 * This class represents the Tree.
	 * 
	 * Specification fields
	 *  Tnode(mval,mLeft,mRight) is a node of a tree with value v, left sub-node l, right sub-node r
	 *  @ mval   : The value of the node of the tree
	 *  @ mLeft  : The left sub-node
	 *	@ mRight : The right sub-node
	 *
	 */
	
	 /* Abstraction Function:
	  * AF(c) = a Tree t,
	  * where Tnode(mval,mLeft,mRight) is a node of a tree 
	  * 	  with value v, left sub-node l, right sub-node r 
	  *       
	  * Representation Invariant:
	  * (mLeft < mval < mRight)
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
	public void add(int val) 
	{
		//EFFECTS: Initializes the tree node value
		//MODIFIES: Modifies this (the value in the tree, so as to maintain the sorted order: mLeft < mval < mRight)
		
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
	}
	
	public String inOrder() 
	{
		//EFFECTS: returns the the values of the Tree nodes in order (from left most sub node to the right most sub-node)
		
		return ((mLeft == null) ? "" : mLeft.inOrder())+ mVal + " " + ((mRight == null) ? "" : mRight.inOrder());
	}
	
	//Client Method
	public static void main(String[] args) 
	{
		Tree t = new Tree(8);
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 1; i < 9; ++i) 
		{ 
			try 
			{
				//Take next integer to be input from user
				System.out.print("Please enter a random integer : ");
				int stackInt = scanner.nextInt();
				t.add(Integer.valueOf(stackInt));
			}
			catch (InputMismatchException inputMismatchException){
				System.err.printf("\nException: %s\n", inputMismatchException);
				scanner.nextLine(); //discard input so user can try again
				System.out.println("You must enter integers. Please try again.\n");
			}
		}
		
		System.out.println("Values in order = " + t.inOrder());
	}
}
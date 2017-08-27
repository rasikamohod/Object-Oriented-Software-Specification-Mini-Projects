package com.rmohod;

import java.util.Stack;

public class TreeIterator {
	/*
	 * Abstraction Function:
	 * Stack of tree nodes
	 * 
	 * 
	 * Representation Invariant:
	 * Stack contains Tree node values in sorted order (leftmost node to righmost node)
	 */
	Stack<Tree> stack = new Stack<Tree>();  
	
	// Constructor   
	public TreeIterator(Tree root) {  
		pushLeftNodes(root);  
	}
	
	//Methods  
	private void pushLeftNodes(Tree currentNode) 
	{
		//EFFECTS: pushes the left nodes of the currentNode on stack
		//MODIFIES: this (stack)
		
		while (currentNode != null) 
		{  
			stack.push(currentNode);  
			currentNode = currentNode.mLeft;  
		}  
	}
 
	public boolean hasNext() 
	{  
		//EFFECTS: returns true if there is any more value in the stack of Tree nodes
		           // else returns false
		
		return !stack.isEmpty();  
	}  
  
	public Integer next() throws Exception 
	{  
		//EFFECTS: returns the next node value on stack
		
		if (!hasNext()) 
		{  
			throw new Exception("All nodes have been visited!");  
		}  

		Tree result = stack.pop();  
		pushLeftNodes(result.mRight);  

		return result.mVal;  
	} 
}

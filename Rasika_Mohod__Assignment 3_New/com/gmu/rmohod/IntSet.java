package com.gmu.rmohod;

import java.util.Collections;
import java.util.Vector;

public class IntSet {
	//OVERVIEW: IntSets are unbounded, mutable sets of integers.
	private Vector<Integer> els; // the rep
		
	// constructors
	public IntSet()
	{
		//EFFECTS: Initializes this to be empty.
		
		els = new Vector<Integer>( ); 
	}
	
	// methods
	public boolean insert (int x)
	{
		//MODIFIES: this
		//EFFECTS:Adds x to the elements of this.
				  //if (x does not already exist in the set) els.add(x); 
		
		if(isIn(x))
		{
			System.out.println("\nInteger "+x+" cannot be inserted as it already exists in the set.");
			return false;
		}
		else
		{
			els.add(x);
			Collections.sort(els);
			return true;
		}
	}
	public void remove (int x) 
	{
		//MODIFIES: this
		//EFFECTS:Removes x from this.
		
		int i = getIndex(new Integer(x));
		if (i < 0) 
			return;
		
		els.set(i,els.lastElement());
		els.remove(els.size()-1); 
	}
	public boolean isIn (int x) 
	{
		//EFFECTS:Returns true if x is in this else returns false.
		
		return getIndex(new Integer(x)) >= 0; 
	}
	private int getIndex (Integer x) 
	{
		//EFFECTS:If x is in this returns index where x appears else returns â€?1.
		
		for (int i=0;i< els.size( ); i++)
				if (x.equals(els.get(i))) 
					return i;
		
		return -1; 
	}
	@Override
	public String toString() 
	{ 
		//EFFECTS: Return string representation of the IntSet.
		String setString=" "+els+" ";
        return setString;
    }
	public void printList()
	{
		//EFFECTS: Prints the IntSet (all the currently available elements in the set).
		
		if(els.isEmpty())
			System.out.println("Currently there are no elements in the IntSet");
		else{
			System.out.println("\nThe IntSet is:"+this.toString());
		}
	}
}

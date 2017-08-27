package com.gmu.rmohod;

/**
 * This class is a generic class which implements a Pair of two elements of any generic type
 * @author Rasika
 *
 * @param <F> type of first element of Pair
 * @param <S> type of second element of Pair
 */

public class Pair<F, S> {
	
	/*
	 * This class represents the Pair.
	 * 
	 * Specification fields
	 *  Pair<F,S> is a pair of two elements of type F & S respectively
	 *  @ firstElement   : The value of the firstElement of the Pair and is of type F
	 *  @ secondElement  : The value of the secondElement of the Pair and is of type S
	 *
	 */

	/* Abstraction Function:
	 * AF(c) = a Pair p,
	 * where Pair<F,S> is a pair
	 * 	  with firstElement of type F and secondElement of type S 
	 *       
	 * Representation Invariant:
	 * firstElement!=null && secondElement!=null
	 * Value of either element of a Pair cannot be null
	 * 
	 */
	
	private F firstElement;
	private S secondElement;
	
	/**
	 * Default Constructor
	 */
	public Pair()
	{
		//Constructor for clients who want to initialize values of elements of pair later
	}
	
	/**
	 * Parameterized Constructor
	 * @param firstElement the first element of the pair
	 * @param secondElement the second element of the pair
	 * @throws Exception if representation is not correct
	 */
	public Pair(F firstElement, S secondElement) throws Exception
	{
		//EFFECTS: Initializes the firstElement and secondElement
        		// & Sets the value of firstElement and secondElement of the pair.
		
		F tempFirstElement = firstElement;
		S tempSecondElement = secondElement;
		
		setFirstElement(tempFirstElement);
		setSecondElement(tempSecondElement);
		
		RepOk();
	}
	
	/**
	 * To check if representation is correct
	 * @throws Exception if representation is not correct
	 */
	public void RepOk() throws Exception
	{
		//EFFECTS: Nothing if rep invariant is satisfied else throws an exception

		F tempFirstElement = firstElement;
		S tempSecondElement = secondElement;

		if(tempFirstElement==null || tempSecondElement==null)
		{
			throw new Exception("Rep is not correct!! Elements of the Pair cannot be null.");
		}
	}
	
	//Getter Methods
	
	/**
	 * Getter method to return value of first element of Pair
	 * @return value of first element of Pair
	 * @throws Exception if rep is not correct
	 */
	public F getFirstElement() throws Exception 
	{
		//EFFECTS: Returns the value of a firstElement of pair
		
		RepOk();
		
		F tempFirstElement = firstElement;
		return tempFirstElement;
	}
	
	/**
	 * Getter method to return value of second element of Pair
	 * @return value of second element of Pair
	 * @throws Exception if rep is not correct
	 */
	public S getSecondElement() throws Exception 
	{
		//EFFECTS: Returns the value of a secondElement of pair
		
		RepOk();
		
		S tempSecondElement = secondElement;
		return tempSecondElement;
	}
	
	//Setter Methods
	
	/**
	 * Setter method to set the value of first element of Pair
	 * @param firstElement
	 */
	public void setFirstElement(F firstElement) 
	{
		//MODIFIES: firstElement
		//EFFECTS: Set the value of a firstElement of pair
		
		F tempFirstElement = firstElement;
		this.firstElement = tempFirstElement;
	}
	
	/**
	 * Setter method to set the value of second element of Pair
	 * @param secondElement
	 */
	public void setSecondElement(S secondElement) 
	{
		//MODIFIES: secondElement
		//EFFECTS: Set the value of a secondElement of pair
		
		S tempSecondElement = secondElement;
		this.secondElement = tempSecondElement;
	}
	
	
	@Override
	/**
	 * toString method overridden 
	 * @return string representation of Pair
	 */
	public String toString()
	{
		//EFFECTS: Returns string representation of the Pair.
		
		String pair = "";
		try 
		{
			pair = "<"+getFirstElement()+","+getSecondElement()+">";
		} 
		catch (Exception e) 
		{
			System.out.println("Exception occured: "+e);
		}
		return pair;
	}
	
}

package com.gmu.rmohod;
/**
 * This class is a generic class which implements a variable of any generic type
 * @author Rasika
 *
 * @param <T> type of variable
 */

public class Variable<T> {
	
	/*
	 * This class represents the Variable.
	 * 
	 * Specification fields
	 *  Variable<T> is a variable of any generic type
	 *  @ value : the value of variable of type T
	 *
	 */

	/* Abstraction Function:
	 * AF(c) = a Variable v,
	 * where Variable<T> is a Variable
	 * 		with value as a value of variable of type T
	 *       
	 * Representation Invariant:
	 * value!=null
	 * Value of variable cannot be null
	 * 
	 */
	
	T value;
	
	/**
	 * Default Constructor
	 */
	public Variable()
	{
		//Constructor for clients who want to initialize value of variable later
	}

	/**
	 * Parameterized Constructor
	 * @param _value value to be set of the variable
	 * @throws Exception if representation is not correct
	 */
	public Variable(T _value) throws Exception
	{
		//EFFECTS: Initializes the value
		
		T temp_value = _value;
		this.value = temp_value;
		
		RepOk();
	}

	/**
	 * To check if representation is correct
	 * @throws Exception if representation is not correct
	 */
	public void RepOk() throws Exception
	{
		//EFFECTS: Nothing if rep invariant is satisfied else throws an exception

		T temp_value = this.value;

		if(temp_value==null)
		{
			throw new Exception("Rep is not correct!! Value of a variable cannot be null.");
		}
	}
	
	/**
	 * Method to set the value of variable
	 * @param newvalue value to be set of the variable
	 */
	public void setValue(T newvalue)
	{
		//MODIFIES: value
		//EFFECTS: Sets the value of a variable
		
		T temp_value = newvalue;
		this.value = temp_value;
	}

	/**
	 * Method to get the value of the variable
	 * @return value of the variable
	 * @throws Exception if representation is not correct
	 */
	public T getValue() throws Exception
	{
		//EFFECTS: Returns the value of a variable
		
		RepOk();
		
		T temp_value = this.value;
		return temp_value;
	} 

	/**
	 * Method to perform swap operation on two different variables of same type
	 * @param other the variable with which this variable is to be swapped
	 * @throws Exception if representation is not correct
	 */
	public void swap(Variable<T> other) throws Exception
	{
		T tmp = this.value;
		this.setValue((other).getValue());
		other.setValue(tmp);
	} 
	
	@Override
	/**
	 * toString method overridden
	 * @return the string representation of a variable
	 */
	public String toString()
	{
		//EFFECTS: Returns string representation of the variable.
		
		String variableValue = "";
		try 
		{
			variableValue = ""+this.getValue()+"";
		} 
		catch (Exception e) 
		{
			System.out.println("Exception occured: "+e);
		}
		return variableValue;
	}
}


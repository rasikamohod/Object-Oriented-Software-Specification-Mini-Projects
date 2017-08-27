package com.gmu.rmohod;
/**
 * This class implements the interface Function.
 * It gives implementation for evaluation of half of any input integer.
 * 
 * @author Rasika
 *
 */
public class Half implements Function {

	@Override
	/**
	 * Method to evaluate half of the input integer
	 * @param num input integer
	 * @return half of the input integer
	 */
	public int evaluate(int num)
	{
		//EFFECTS: Returns the evaluated value of an input integer by dividing it by 2
		
		return num/2;
	}

}

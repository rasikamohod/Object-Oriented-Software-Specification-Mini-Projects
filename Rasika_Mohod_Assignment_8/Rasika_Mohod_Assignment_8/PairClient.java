package com.gmu.rmohod;

/**
 * This class is Client class for Class Pair.
 * This class exercises the operations on Pair class.
 * 
 * @author Rasika
 */

public class PairClient {

	public static void main(String[] args) throws Exception
	{
		//Continue to test and run next input set even if exception occurs in any input set
		for (int numInputs=3; numInputs >0; numInputs--) 
		{
			try
			{
				/**
				 * 3 different types of Pair objects are given as input with different types of elements 
				 */
				
				/*--- Input 1 ---*/
				if(numInputs==3)
				{
					System.out.println("Elements to be set for Pair 1: 4400 , University Drive");
					Pair<Integer, String> p1 = new Pair<>(4400,"University Drive");
					System.out.println("First pair is: "+p1.toString());
				}
				
				/*--- Input 2 ---*/
				if(numInputs==2)
				{
					System.out.println("\n\nElements to be set for Pair 2: 3, null");
					Pair<Integer,Double> p3 = new Pair<>(3, null);
					System.out.println("Second pair is: "+p3.toString());
				}
				
				/*--- Input 3 ---*/
				if(numInputs==1)
				{
					System.out.println("\n\nElements to be set for Pair 3: George Mason Univerity , Fairfax Campus");
					Pair<String, String> p2 = new Pair<String, String>();
					p2.setFirstElement("George Mason Univerity");
					p2.setSecondElement("Fairfax Campus");
					System.out.println("Third pair is: "+p2.toString());
				}
			}
			catch(Exception e)
			{
				System.out.println("Exception occured: "+e);
			}
		}
	}
}

package com.gmu.rmohod;
import java.util.Arrays;

/**
 * This class is Client class for Class Half.
 * This class exercises the operations using Half class.
 * @author Rasika
 *
 */
public class HalfClient {

	public static void main(String args[])
	{
		//Continue to test and run next input set even if exception occurs in any input set
		for (int numInputs=3; numInputs >0; numInputs--) 
		{
			try
			{
				/**
				 * 3 different types of Variables are given as input
				 */

				/*--- Input 1 ---*/
				if(numInputs==3)
				{
					int[] array= null;
					System.out.print("Input Array 1: "+Arrays.toString(array));
					int newArray[] = makeHalf(array);
					System.out.print("\nNew Array: "+Arrays.toString(newArray));
				}

				/*--- Input 2 ---*/
				if(numInputs==2)
				{
					int[] array2= {0,55,16,40,7};
					System.out.print("\n\nInput Array 2: "+Arrays.toString(array2));
					int newArray2[] = makeHalf(array2);
					System.out.print("\nNew Array: "+Arrays.toString(newArray2));
				}

				/*--- Input 3 ---*/
				if(numInputs==2)
				{
					int[] array3= {-5,44,-1,89,7,34,10900};
					System.out.print("\n\nInput Array 3: "+Arrays.toString(array3));
					int newArray3[] = makeHalf(array3);
					System.out.print("\nNew Array: "+Arrays.toString(newArray3));
				}
			}
			catch(Exception e)
			{
				System.out.println("\nException occured: "+e);
			}
		}
	}
	/**
	 * Method to evaluate half of each element of input array
	 * @param array of integer values
	 * @return array with each element calculated as half of the corresponding element in input array
	 */
	public static int[] makeHalf(int array[])
	{
		//EFFECTS: Returns an array with each element calculated as half of the corresponding element in input array
		
		Half halfObject = new Half();
		
		for(int i=0;i<array.length;i++)
		{
			array[i]=halfObject.evaluate(array[i]);
		}
		
		return array;
	}
}

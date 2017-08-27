package com.gmu.rmohod;

/**
 * This class is Client class for Class Variable.
 * This class exercises the operations on Variable class.
 * @author Rasika
 *
 */
public class VariableClient {
	
	public static void main(String[] args) throws Exception
	{
		try
		{
			/**
			 * 3 different types of Variables are given as input
			 */
			
			/*--- Input 1 ---*/
			System.out.println("Orignial values in Input Set 1: v1= 10 & v2= 100");
			Variable<Integer> v11= new Variable<>(10);
			Variable<Integer> v12= new Variable<>(100);
			v11.swap(v12);
			System.out.println("New value of v1: " + v11.toString() + " & v2: " + v12.toString());
			
			/*--- Input 2 ---*/
			System.out.println("\n\nOrignial values in Input Set 2: v1= Hi! & v2= Bye!");
			Variable<String> v21= new Variable<>();
			v21.setValue("Hi!");
			Variable<String> v22= new Variable<>();
			v22.setValue("Bye!");
			v21.swap(v22);
			System.out.println("New value of v1: " + v21.toString() + " & v2: " + v22.toString());
			
			/*--- Input 3 ---*/
			System.out.println("\n\nOrignial values in Input Set 3: v1= Hi! & v2= null");
			Variable<Double> v31= new Variable<>(93.5);
			Variable<Double> v32= new Variable<>(null);
			v31.swap(v32);
			System.out.println("New value of v1: " + v31.toString() + " & v2: " + v32.toString());
		}
		catch(Exception e)
		{
			System.out.println("Exception occured: "+e);
		}
	}
}

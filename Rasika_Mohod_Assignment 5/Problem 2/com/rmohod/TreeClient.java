package com.rmohod;

import java.util.InputMismatchException;
import java.util.Scanner;
//Client Class
public class TreeClient {
	
	public static void main(String[] args) throws Exception 
	{
		/* 
		 * 2 different types of input arrays are already hardcoded to be inserted in Tee below to check validation of code in all cases
		 * Also user input is taken to insert into the set
		 */
		 
		
		/*--- Start of Input 1 ---*/
		Tree tree1 = new Tree(1);
		int[] treeArray1={10,45,9,-99,6,33,-8};
		System.out.print("\nInput elements to be inserted in Tree 1: "+"\n 1");
		for(int i=0;i<treeArray1.length;i++)
		{
			System.out.print("  "+treeArray1[i]);
		}
		for (int i = 0; i < treeArray1.length; i++) 
		{ 
			try 
			{
				//Take next integer to be input from user
				tree1.add(Integer.valueOf(treeArray1[i]));
			}
			catch (InputMismatchException inputMismatchException){
				System.err.printf("\nException: %s\n", inputMismatchException);
			}
			catch (Exception e)
			{
				System.out.println("\n"+e);
			}
		}
		
		System.out.println("\nValues in order = " + tree1.inOrder());
		/*--- End of Input 1 ---*/
		
		
		/*--- Start of Input 2 ---*/
		Tree tree2 = new Tree(2);
		int[] treeArray2={1,45,-9,56,34,45};
		System.out.print("\n\nInput elements to be inserted in Tree 2: "+"\n 2");
		for(int i=0;i<treeArray2.length;i++)
		{
			System.out.print("  "+treeArray2[i]);
		}
		for (int i = 0; i < treeArray2.length; i++) 
		{ 
			try 
			{
				//Take next integer to be input from user
				tree2.add(Integer.valueOf(treeArray2[i]));
			}
			catch (InputMismatchException inputMismatchException){
				System.err.printf("\nException: %s\n", inputMismatchException);
			}
			catch (Exception e)
			{
				System.out.println("\n"+e+" For integer "+treeArray2[i]);
			}
		}
		
		System.out.println("\nValues in order = " + tree2.inOrder());
		/*--- End of Input 2 ---*/
		
		
		/*--- Start of Input 3 ---*/
		//Input Set 4: To be taken from user
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n\nUser Input:");
		Tree t = new Tree(0);
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
			catch (Exception e)
			{
				System.out.println("\n"+e);
			}
		}

		System.out.println("\nValues in order = " + t.inOrder());
		/*--- End of Input Set 3 ---*/
	}
}

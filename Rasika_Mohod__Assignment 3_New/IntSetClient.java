package com.gmu.rmohod;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntSetClient {
	public static void main(String[] args)throws Exception
	{
		IntSet intset = new IntSet();
		
		//Initially the set is empty
		System.out.println("Before insertion of elements in set:");
		intset.printList();

		//Start inserting the elements in the set
		System.out.println("\nAfter insertion of elements in set:");
		
		try{
			/* 
			 * 3 different types of input sets are already hardcoded to be inserted below to check validation of code in all cases
			 * Also user input is taken to insert into the set
			 */
			 
			
			/*--- Start of Input Set 1 ---*/
			//Input Set 1: Elements are null
			int[] elsArray1=null;
			System.out.println("\nInput elements to be inserted in set 1: "+elsArray1);
			try{
				for(int i=0;i<elsArray1.length;i++)
				{
					try{
						intset.insert(Integer.valueOf(elsArray1[i]));
					}
					catch(InputMismatchException inputMismatchException){
						System.out.println("Only integer values are expected.Please enter valid integer.");
					}
					catch(Exception e){
						System.out.println("Elements given to be inserted in set are null. Please enter valid elements.");
					}
				}
			}
			catch(NullPointerException e){
				System.out.println("Elements given to be inserted in set are null. Please enter valid elements.");
			}
			System.out.print("-----------------------------------------------------------");
			/*--- End of Input Set 1 ---*/
			
			
			/*--- Start of Input Set 2 ---*/
			//Input Set 2: Elements to be inserted contain duplicate values
			int[] elsArray2={1,45,-9,56,34,45};
			System.out.print("\nInput elements to be inserted in set 2: ");
			for(int i=0;i<elsArray2.length;i++)
			{
				System.out.print(" "+elsArray2[i]);
			}
			
			for(int i=0;i<elsArray2.length;i++)
			{
				try{
					intset.insert(Integer.valueOf(elsArray2[i]));
				}
				catch(InputMismatchException inputMismatchException){
					System.out.println("Only integer values are expected.Please enter valid integer.");
				}
				catch(Exception e){
					System.out.println("Elements given to be inserted in set are null. Please enter valid elements.");
				}
			}
			intset.printList();
			System.out.print("-----------------------------------------------------------");
			/*--- End of Input Set 2 ---*/
			
			
			/*--- Start of Input Set 3 ---*/
			
			//Input Set 3: Elements are all valid Set elements
			IntSet intset2 = new IntSet();
			int[] elsArray3={10,45,9,-99,6,33,-8};
			System.out.print("\nInput elements to be inserted in set 3: ");
			for(int i=0;i<elsArray3.length;i++)
			{
				System.out.print(" "+elsArray3[i]);
			}
			
			for(int i=0;i<elsArray3.length;i++)
			{
				try{
					intset2.insert(Integer.valueOf(elsArray3[i]));
				}
				catch(InputMismatchException inputMismatchException){
					System.out.println("Only integer values are expected.Please enter valid integer.");
				}
				catch(Exception e){
					System.out.println("Elements given to be inserted in set are null. Please enter valid elements.");
				}
			}
			intset2.printList();
			System.out.print("-----------------------------------------------------------");
			/*--- End of Input Set 3 ---*/
			
			
			/*--- Start of Input Set 4 ---*/
			//Input Set 4: To be taken from user
			IntSet intset3 = new IntSet();
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("\nEnter number of elements to be inserted in set 4: ");
			int numOfElements = scanner.nextInt();
			
			for(int i=0;i<numOfElements;i++)
			{
				try{
					System.out.print("\nEnter element to inserted: ");
					int next = scanner.nextInt();
					boolean flag=intset3.insert(Integer.valueOf(next));
					if(flag==false) // if element was not valid to inserted
					{
						i--; // discard the current incorrect input try and give another chance to user
					}
				}
				catch(InputMismatchException inputMismatchException){
					scanner.nextLine();
					i--; // discard the current incorrect input try and give another chance to user
					System.out.println("\nOnly integer values are expected.Please enter valid integer.");
				}
				catch(Exception e){
					System.out.println("Elements given to be inserted in set are null. Please enter valid elements.");
				}
			}
			intset3.printList();
			System.out.print("-----------------------------------------------------------");
			/*--- End of Input Set 4 ---*/
		}
		catch(NullPointerException e){
			System.out.println("Elements given to be inserted in set are null. Please enter valid elements.");
		}
	}
}

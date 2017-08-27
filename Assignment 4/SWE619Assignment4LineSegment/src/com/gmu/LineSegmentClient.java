package com.gmu;
//Client class used to input the data required to calculate the length of a line segment

public class LineSegmentClient {
	public static void main(String args[])
	{
		try{
			//Test input: with 2 different points
			System.out.println("LineSegment 1=> ");
			LineSegment lineSegment1 = new LineSegment(1,3,2,5);
			lineSegment1.printSegmentLength();
			
			//Test input: with 2 different points
			System.out.println("\nLineSegment 2=> ");
			LineSegment lineSegment2 = new LineSegment(-2,4,2,9);
			lineSegment2.printSegmentLength();
			
			//Test input: with 2 same points
			System.out.println("\nLineSegment 3=> ");
			LineSegment lineSegment3 = new LineSegment(-2,4,-2,4);
			lineSegment3.printSegmentLength();
		}
		catch(Exception e)
		{
			System.out.println("Exception occured: "+e);
		}
	}
}

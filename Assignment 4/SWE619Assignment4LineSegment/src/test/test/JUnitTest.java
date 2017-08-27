package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gmu.LineSegment;

public class JUnitTest {

	@Test
	//Test case written to be successful
	public void test1() throws Exception {
	
		LineSegment lineSegment = new LineSegment(-2,4,2,9);
		double calculatedLength = lineSegment.lineSegmentLength();
		double expectedLength = 6.4031242374328485;
		if(calculatedLength!=expectedLength)
		{
			assertTrue(false);
			fail("Test case Failed as the computed length of line segment is not correct.");
		}
	}
	@Test
	//Test case written to be unsuccessful
	public void test2() throws Exception {
		
		LineSegment lineSegment = new LineSegment(1,3,2,5);
		double calculatedLength = lineSegment.lineSegmentLength();
		double expectedLength = 6.4031242374328485;
		if(calculatedLength!=expectedLength)
		{
			assertTrue(false);
			fail("Test case Failed as the computed length of line segment is not correct.");
		}
	}

}

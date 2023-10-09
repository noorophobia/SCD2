package q3;

import java.util.*;

import q1.ExceptionHandling;

public class q3 {
	public static void main(String args[])  {
		List<int[]> intervals=new ArrayList<int[]> ();

	/*	int[]newlist1={1,3};
		int[]newlist2={2,6};
		int[]newlist3={8,10};
		int[]newlist4={15,30};
		 */
		  
		int[]newlist1={1,4};
		int[]newlist2={4,6};
		int[]newlist3={7,9};
		int[]newlist4={10,12};
		intervals.add(newlist1);
		intervals.add(newlist2);

		intervals.add(newlist3);

		intervals.add(newlist4);

		
	IntervalMerge m= new IntervalMerge(intervals);
	 
	  
}
}
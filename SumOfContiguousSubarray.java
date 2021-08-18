/*
Day-04
Excellence is not an act, but a habit.
Author: Rupam Upadhyai
Question:07 
*/
package com.master.java;
public class SumOfContiguousSubarray 
	{
		   //Driver code
		   public static void main(String[] args) 
		   {
				int arr[]= {-2,5,9,0,-4,8,2};
		        System.out.println("Maximum Subarray Sum is "+maximumsubarray(arr));
		   }
	
		   //method subarray
			public static int maximumsubarray(int arr[])
		    { 
			   int maxsum=0;
			   int currsum=0;
		       for(int i=0; i < arr.length; i++)
		       {
		    	  currsum = currsum+arr[i]; // calculate current sum
		    	  if(currsum>maxsum) // if less than maximum sum discard.
		    	  {
		    		 maxsum=currsum; 
		    	  }
		    	  if(currsum<0)// if negative discard
		    	  {
		    		  currsum=0;
		    	  }
		       }
		       return maxsum;
		    }      
		
		

	}



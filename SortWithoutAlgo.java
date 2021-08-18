/*
Day-02
Miles to go before, I sleep.
Author: Rupam Upadhyai
Question:04 
*/
package com.master.java;

public class SortWithoutAlgo {

	public static void main(String[] args) {
		
		int zerocount=0;
		int onecount=0;
		//initialize array
		int arr[]=new int[] {2,0,1,0,2,1};
		//count no. of zeros
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
				zerocount++;
		}
		//count no. of ones
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
				onecount++;
		}
		//print zeros 
		for(int i=0;i<zerocount;i++)
		{
			arr[i]=0;
		}
		//print ones
		for(int i=zerocount;i<(zerocount + onecount);i++)
		{
			arr[i]=1;
		}
		//print twos
		for(int i=(zerocount + onecount); i<arr.length;i++)
		{
			arr[i]=2;
		}
		
		System.out.println("The Sorted array is:");
		for(int j=0; j<arr.length;j++)
		{
			System.out.print(" "+arr[j]);
		}
	}	
}

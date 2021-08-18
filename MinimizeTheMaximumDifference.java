/*
Day-04
Excellence is not an act, but a habit.
Author: Rupam Upadhyai
Question:07 
*/
package com.master.java;

import java.util.Arrays;

public class MinimizeTheMaximumDifference {

	public static void main(String[] args) {
		int arr[] = {1, 15, 10};
		int k=6;
		Arrays.sort(arr);
		System.out.println("Maximum difference is "+maximumdifference(arr,k));
	}
	
	public static int maximumdifference(int arr[], int k)
	{
		int diff=0;
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]<=k)
			{
				arr[i]=arr[i]+k;
			}
			else
			{
				arr[i]=arr[i]-k;
			}
		}
		Arrays.sort(arr);
		System.out.println("The elememts of array are: "+Arrays.toString(arr));
		diff = arr[arr.length-1]-arr[0];
		return diff;
	}

}

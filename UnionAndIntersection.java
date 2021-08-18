/*
Day-03
Miles to go before, I sleep.
Author: Rupam Upadhyai
Question:05 
*/
package com.master.java;

import java.util.Arrays;

public class UnionAndIntersection {
	
	//Intersection method
	static void printIntersection(int arr[],int arr1[],int m,int n)
	{
		 int i=0,j=0;
		 while(i<m && j<n)
		 {
			 if(arr[i]==arr1[j]) 
			 {
				 System.out.print(" "+arr[i]);
				 i++; 
				 j++;
			 }
			 else if(arr[i]>arr1[j])
			 {
				 j++;
			 }
			 else
			 {
				 i++;
			 }
			 
		 }
	}
	
	// Union method
	static void printUnion(int arr[],int arr1[],int m,int n)
	{
		 int i=0,j=0;
		 while(i<m && j<n)
		 {
			
			 if(arr[i]<arr1[j])
			 {
				 System.out.print(" "+arr[i]);
				 i++;
			 }
			 else if (arr1[j]<arr[i])
			 {
				 System.out.print(" "+arr1[j]);
				 j++;
			 }
			 else 
			 {
				 System.out.print(" "+arr[i]);
				 i++; 
				 j++;
			 }
			 
		 }
		 
		 while(i<m)
		 {
			 System.out.print(" "+arr[i]);
			 i++; 
		 }
		 while(j<n)
		 {
			 System.out.print(" "+arr1[j]);
			 j++;
		 }
	}
	
	//Driver code
	public static void main(String[] args) {
	
		 int arr[]= new int[] {-1,6,2,4,-8,7};
		 int arr1[]= new int[] {-3,6,4,-1,9,11,10,0};
		 int m=arr.length;
		 int n=arr1.length;
		 
		//Sort the arrays
		Arrays.sort(arr);
		Arrays.sort(arr1);
		
		//Intersection
		System.out.println("Intersection:");
		printIntersection(arr,arr1,m,n);
		
		//Union
		System.out.println("\nUnion: ");
		printUnion(arr,arr1,m,n);
	}
}

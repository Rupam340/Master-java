/*
Day-02
Miles to go before, I sleep.
Author: Rupam Upadhyai
Question:04 
*/
package com.master.java;
public class NegativeElementsToOneSide {

	public static void main(String[] args){
		//initialize array
		int arr[]=new int[] {-2,5,9,-1,-4,8,2};
		int arr1[]=new int[3];
		int arr2[]=new int[4];
		int j=0, k=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<0)
			{
				arr1[j]=arr[i];
				j++;
			}
			else
			{
				arr2[k]=arr[i];
				k++;
			}
		}
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(" "+arr1[i]);
		}
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(" "+arr2[i]);
		}
		
	}

}

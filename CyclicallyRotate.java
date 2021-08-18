/*
Day-04
Excellence is not an act, but a habit.
Author: Rupam Upadhyai
Question:06 
*/
package com.master.java;

import java.util.Arrays;

public class CyclicallyRotate {

	public static void main(String[] args) {
		
		int temp;
		int arr[]=new int[] {1, 2, 3, 4, 5};
		temp=arr[arr.length-1];
		int k=arr.length;
		for(int i=0; i<(arr.length-1);i++)
		{
			arr[k-1]=arr[k-2];
			k--;
		}
		arr[0]=temp;
		System.out.print("Rotated Array:" +Arrays.toString(arr));

	}

}

/*WarmUp Question*/
package com.master.java;

public class CopyArray {

	//initialize Array
	public static void main(String[] args) {
		int arr[] = new int[] {1,2,3,4,5};
		int arr1[] = new int[arr.length];
		for(int i=0; i<arr.length;i++)
		{
			arr1[i]=arr[i];
		}
		
			//Printing Original Array
			System.out.println("Elements of original array are:");
			for(int i=0; i<arr.length;i++)
			{
				System.out.print(arr[i] +" ");
			}
		
		 System.out.println();
		
		//Printing Copied Array
		System.out.println("Elements of copied array are:");
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr1[i] +" ");
		}

	}

}

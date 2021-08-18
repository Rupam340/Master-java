/*
Day-01
Practice makes a man perfect.
Author: Rupam Upadhyai
Question:02 
*/
package com.master.java;

import java.util.Scanner;

public class MaximumAndMinimum {

	public static void main(String[] args) {

		//input from User
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the size of the array");
		 int n=sc.nextInt();
				
		 //Declare an array and take input from user
		 int arr[]= new int[n];
		 System.out.println("Enter the array values");
		 for(int i=0;i<n;i++)
		 {
			arr[i] =sc.nextInt();
		 }
		 
		 //finding the minimum and maximum value
		 int min = arr[0];
		 int max = arr[0];
		 
		 for(int j=0;j<arr.length;j++)
		 {
			 if(arr[j]<min)
				 min=arr[j];
			 
			 if(arr[j]>max)
				 max=arr[j];
		 }
		 
		 System.out.println("Minimum " + min);
		 System.out.println("Miximum " + max);
		 sc.close();
	}

}

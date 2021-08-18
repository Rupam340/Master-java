/*
Day-02
Miles to go before, I sleep.
Author: Rupam Upadhyai
Question:03 
*/
package com.master.java;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestAndLargest {

	public static void main(String[] args) 
	{
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
		 
		 //Calculate kth maximum or minimum
		 Arrays.sort(arr);
		 int ch,k;
		 System.out.println("Choose the option:");
		 System.out.println("1.Kth Maximum\n2.Kth Minimum");
		 ch = sc.nextInt();
		 switch(ch)
		 {
		 	case 1:
		 		System.out.println("Enter the value of K for Kth Maximum");
		 		k= sc.nextInt();
		 		System.out.println("Kth Maximum value is:" +arr[n-k]);
		 	
		 	case 2:
		 		System.out.println("Enter the value of K for Kth Minimum");
		 		k= sc.nextInt();
		 		System.out.println("Kth Minimum value is:" +arr[k-1]);
		 }
		 
		 sc.close();
	}

}

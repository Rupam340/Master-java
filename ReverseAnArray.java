/*
Day-01
Practice makes a man perfect.
Author: Rupam Upadhyai
Question:01 
*/
package com.master.java;
import java.util.*;
public class ReverseAnArray {

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
		
		//Reverse the array
		int start=0;
		int end=n-1;
		int temp;
		while(start<end)
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
		System.out.println("The reversed array is:");
		for(int j=0;j<n;j++)
		{
			System.out.println(arr[j]);
		}
		sc.close();
	
	}

}

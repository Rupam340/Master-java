package com.master.java;

public class ProductOfArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int n =arr.length;
		int ans = product(arr,n);
		System.out.println("The result of the given input is: "+ans);
	}
	
	static int product(int arr[], int n)
	{
		if(n<=0)
		{
			return 1;
		}
		return (arr[n-1]*product(arr,n-1));
		/*int result=1;
		for(int i=0;i<n;i++)
		{
			result = result*arr[i];
		}
		return result;*/
	}

}

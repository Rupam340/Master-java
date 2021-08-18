package com.master.java;

public class FibonacciRecurssion {

	public static void main(String[] args) {
		int result;
		result = fibonacci(7);
		System.out.println("The result of the input is: "+result);
		System.out.print("The fibonacci series is:");
		for(int i=0; i<8;i++)
		{
			System.out.print(" " +fibonacci(i));
		}

	}
	
	static int fibonacci(int n)
	{
		if(n<0)
		{
			return -1;
		}
		if(n==0 || n==1)
		{
			return n;
		}
		
		return fibonacci(n-1)+fibonacci(n-2);
	}

}

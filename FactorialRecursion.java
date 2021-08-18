package com.master.java;

public class FactorialRecursion {

	public static void main(String[] args) {
		
		int result;
		result = factorial(16);
		System.out.println("The factorial of given input is: "+result);
	}
	
	static int factorial(int n)
	{
		if(n<0)
		{
			return -1;
		}
		if(n==0 || n==1)
		{
			return 1;
		}
		return n*factorial(n-1);
	}

}

package com.master.java;

public class SumOfDigitsRecursion {

	public static void main(String[] args) {
		int n =233456;
		int result =sumofdigit(n);
		System.out.println("The sum of digits of the given input is: "+ result );
		// 5%10 = 5
		// 5/10 = 0
	}
	
	static int sumofdigit(int n)
	{
		if(n==0 || n<0)
		{
			return 0;
		}
		return n%10 + sumofdigit(n/10);
	}

}

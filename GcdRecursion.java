package com.master.java;

public class GcdRecursion {

	public static void main(String[] args) {
		int result = gcd (8,12);
		System.out.println("The result of the given input is: "+result);
		//int rem = 8%12;
		//System.out.println(rem); //(8%12=8, smaller no % larger number = smaller number)
	}
	
	static int gcd(int n, int m)
	{
		if(m==0)
		{
			return n;
		}
		if(m<0 || n<0)
		{
			return -1;
		}
		return gcd(m, n%m);
		
		
	}
	
	

}

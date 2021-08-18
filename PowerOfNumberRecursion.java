package com.master.java;

public class PowerOfNumberRecursion {

	public static void main(String[] args) {
		int result = power (5,3);
		System.out.println("The result of the given input is: "+result);

	}
	
	static int power(int n, int m)
	{
		if(m<0)
		{
			return -1;
		}
		if(m==0)
		{
			return 1;
		}
		return n * power(n, m-1);
	}

}

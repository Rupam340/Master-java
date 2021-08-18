package com.master.java;

public class RecursiveRange {

	public static void main(String[] args) {
	 int result = range(2);
	 System.out.println("The result of the given input is: "+result);
	}
	
	static int range(int n)
	{
		if(n==0 || n<0)
		{
			return 0;
		}
		return n+ range(n-1);
	}

}

package com.master.java;

public class DecimalToBinaryRecursion {

	public static void main(String[] args) {
		int result = tobinary(10);
		System.out.println("The result of the given input is: "+result);
	}
	
	static int tobinary(int n)
	{
		if(n==0)
		{
			return 0;
		}
		return n%2 + 10*tobinary(n/2);
	}
	// by custom logic
	/*public static void tobinary(int decimal)
	{
		int binary[] = new int[40];
		int index=0;
		while(decimal>0)
		{
			binary[index++]= decimal%2;
			decimal = decimal/2;
		}
		
		for(int i=index-1;i>-1;i--)
		{
			System.out.print(binary[i]);
		}
		System.out.println();
	}*/
}

package com.master.java;

public class ReverseStringRecursion {

	public static void main(String[] args) {
		String str2 = reverse("rupam"); 
		System.out.println("The reverse of input string is: "+str2);
	}

	static String reverse(String str)
	{
		if(str.isEmpty())
		{
			return str;
		}
		return reverse(str.substring(1)) + str.charAt(0); // str.substring(1) = upam | str.charAt(0)= r
	}
}

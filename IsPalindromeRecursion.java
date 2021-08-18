package com.master.java;

public class IsPalindromeRecursion {

	public static void main(String[] args) {
		boolean result = palindrome("nitin");
		System.out.println(result);

	}
	
	static boolean palindrome(String str)
	{
		String str2 = reverse("nitin");
		if(str.equals(str2))
		{
			return true;
		}
		return false;
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

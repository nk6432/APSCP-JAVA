package com.github.nk6432.csp2023.Lab;

public class Sample_String1 {
	public static void main(String[] args) {
		//String Concatenation
		String str1 = "Rock";
		String str2 = "Star";
		//Method 1 : Using concat
		String str3 = str1.concat(str2);
		System.out.println(str3);
		//Method 2 : Using "+" operator
		String str4 = str1 + str2;
		System.out.println(str4);
	}
}
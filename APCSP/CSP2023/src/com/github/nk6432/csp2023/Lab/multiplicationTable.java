package com.github.nk6432.csp2023.Lab;

public class multiplicationTable {

	public static void main(String args[]) {
		for (int i=1; i<=10; i++) {
			for (int j=1; j<=10; j++) {
				System.out.print("\t" + i * j);
			}
			System.out.println();
		}
	}
}
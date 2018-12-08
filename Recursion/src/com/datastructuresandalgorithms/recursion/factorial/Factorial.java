package com.datastructuresandalgorithms.recursion.factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		System.out.println(factorialOf(in.nextInt()));
		
	}
	
	public static int factorialOf(int n) {
		if(n<0)
			throw new IllegalArgumentException();
		else if(n==0)
			return 1;
		else
			return n*factorialOf(n-1);
	}

}

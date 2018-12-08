package com.datastructuresandalgorithms.recursion.BinarySearch;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int arraylength= in.nextInt();
		
		int [] arr = new int [arraylength];
		
		for (int i=0;i<arraylength;i++)
			arr[i]=in.nextInt();
		
		int target= in.nextInt();
		
		System.out.println(binarySearch(arr,target, 0, arr.length-1));
	}
	
	public static boolean binarySearch(int[] data,int target, int low, int high) {
		if (low>high)
			return false;
		else {
			int mid=(low+high)/2;
			if(target==data[mid])
				return true;
			else if (target<data[mid])
				return binarySearch(data, target, low, mid-1);
			else
				return binarySearch(data, target,mid+1,high);
		}
	}

}

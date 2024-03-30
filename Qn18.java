package com;

import java.util.Arrays;

/*
 18) Given an array of random numbers, Push all the zero’s of a given array to the end of
the array.

 */
public class Qn18 {
	public static void main(String[] args) {
		int arr[]= {1, 0, 1, 0, 1, 0, 1, 0};
		int ans[]=new int[arr.length];
		for (int i = 0,m=0; i < arr.length-1; i++) {
			if(arr[i]!=0) {
				ans[m++]=arr[i];
			}
		}
		System.out.println(Arrays.toString(ans));
	}
}

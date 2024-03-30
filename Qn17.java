package com;

import java.util.Arrays;

/*
 17) Write a program to in-place move all zeros to the end in the given integer array.
Without using extra array
 */
public class Qn17 {
	public static void main(String[] args) {
		int arr[] = {9,2,0,4,3,0,2,0};
		int zero = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[zero];
				arr[zero] = temp;
				zero++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}

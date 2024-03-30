package com;
/*
 9) Write a program to print all the LEADERS in the array. An element is leader if it is
greater than all the elements to its right side. And the rightmost element is always a
leader.

 */
public class Qn9 {
	public static void main(String[] args) {
		int arr[]= {16, 17, 4, 3, 5, 2};
		System.out.println("Leaders int the array is\n");
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i]<arr[i+1]) {
				System.out.print(arr[i+1]+" ");
			}
		}
		System.out.print(arr[arr.length-1]);
	}

}

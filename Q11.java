package com;

import java.util.Arrays;

public class Q11 {
	public static int findMinimumPosibleHealth(int [] arr){
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1; j<arr.length;j++){
                int a = Math.min(arr[i],arr[j]);
                arr[j] = arr[j]-a;
            }
        }
        return arr[arr.length-1];
    }
	public static void main(String[] args) {
        int []arr = {4,6,8};
        System.out.println("findMinimumPosibleHealth is="+findMinimumPosibleHealth(arr));
        int arr2[]= {4,1,5,3};
        System.out.println("findMinimumPosibleHealth is="+findMinimumPosibleHealth(arr2));
    }
    
}

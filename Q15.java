package com;

public class Q15 {
	public static void main(String[] args) {
		String s="4-2+6*3";
		int num1= s.charAt(0)-'0';
		for (int i = 1; i < s.length()-1; i+=2) {
			int num2 = s.charAt(i+1)-'0';
			num1 = performOperation(num1,num2,s.charAt(i));
		}
		System.out.println(num1);
	}
	 public static int performOperation(int num1, int num2, char c){
	        switch (c) {
	            case '+':{
	                return num1+num2;
	            }
	            case '-':{
	                return num1-num2;
	            }
	            case '*':{
	                return num1*num2;
	            }
	            case '/':{
	                return num1/num2;
	            }

	        }
	        return 0;
	    }

}

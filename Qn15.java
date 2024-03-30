package com;

public class Qn15 {
	public static void main(String[] args) {
		String s = "4--2+6*3";// 24
		System.out.println("Evaluate the String =" + evaluateString(s));
	}

	public static int evaluateString(String s) {
		int left = s.charAt(0) - 48;// 4
		for (int i = 0; i < s.length() - 1; i += 2) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				char operator = s.charAt(i + 1);
				int right = s.charAt(i + 2) - 48;// 2
				left = performOperation(left, right, operator);// 2 8 24
			} else {
				return -1;
			}
		}
		return left;

	}

	public static int performOperation(int num1, int num2, char c) {
		switch (c) {
		case '+': {
			return num1 + num2;
		}
		case '-': {
			return num1 - num2;
		}
		case '*': {
			return num1 * num2;
		}
		case '/': {
			return num1 / num2;
		}
		default:
			return 0;
		}
	}
}

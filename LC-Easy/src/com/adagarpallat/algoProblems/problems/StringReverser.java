package com.adagarpallat.algoProblems.problems;

import java.util.Scanner;

public class StringReverser {
	public static void TryStringReverser() {
		System.out.println("Enter string characters...");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		scanner.close();
		reverseString(s.toCharArray());
	}
	public static void reverseString(char[] s) {
		int left = 0, right = s.length - 1;
		while(left < right) {
			char joker = s[left];
			s[left++] = s[right];
			s[right--] = joker;
		}
		for(char c: s) {
			System.out.print(c);
		}
	}

}

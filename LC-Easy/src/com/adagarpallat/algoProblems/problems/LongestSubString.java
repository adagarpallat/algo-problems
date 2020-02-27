package com.adagarpallat.algoProblems.problems;

import java.util.*;

public class LongestSubString {
	public static void TryLongestSubStringLength() {
		System.out.println("Enter the string to search in...");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.next();
		scanner.close();
		int length = findLength(inputString);
		System.out.println("The length of the longest substring without repeating characters is - " + length + ".");
	}
	private static int findLength(String inputString) {
		char[] chars = inputString.toCharArray();
		int index = 0;
		int longest = 0;
		ArrayList<Character> substring = new ArrayList<Character>();
		while(index < chars.length - 1 && (chars.length - (index + 1)) >= longest) {
			System.out.println("New iteration starting at index - " + index);
			int i = index;
			while(i <= chars.length - 1) {
				int presentIndex = substring.indexOf(chars[i]);
				if(presentIndex == -1) {
					substring.add(chars[i]);
				}
				else {
					if(chars[index] != chars[i])
						index = presentIndex + index;
					longest = substring.size() > longest? substring.size(): longest;
					substring = new ArrayList<Character>();
					break;
				}
				longest = substring.size() > longest? substring.size(): longest;
				i++;
			}
			index++;
		}
		return longest;
	}
}

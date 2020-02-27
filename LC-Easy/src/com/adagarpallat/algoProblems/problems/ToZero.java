package com.adagarpallat.algoProblems.problems;

import java.util.Scanner;

public class ToZero {
	public static void TryToZero() {
		System.out.println("Enter a number...");
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.next());
		scanner.close();
		System.out.println("Number of steps to zero is - " + numberOfSteps(num));
	}
	private static int numberOfSteps(int num) {
		int steps = 0;
		while(num > 0) {
			if(num % 2 == 1)
				num--;
			else
				num = num / 2;
			steps++;
		}
		return steps;
	} 
}

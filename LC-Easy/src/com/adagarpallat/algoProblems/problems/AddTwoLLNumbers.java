package com.adagarpallat.algoProblems.problems;

import java.util.LinkedList;
import java.util.Scanner;

public class AddTwoLLNumbers {
	public static void TryAddTwoLLNumbers() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		LinkedList<Integer> firstNumber = new LinkedList<Integer>();
		firstNumber.add(new Integer(scanner.next()));
		firstNumber.add(new Integer(scanner.next()));
		firstNumber.add(new Integer(scanner.next()));
		System.out.println("Enter the second number");
		LinkedList<Integer> secondNumber = new LinkedList<Integer>();
		secondNumber.add(new Integer(scanner.next()));
		secondNumber.add(new Integer(scanner.next()));
		secondNumber.add(new Integer(scanner.next()));
		scanner.close();
		System.out.println("Sum of two numbers is ...");
		LinkedList<Integer> thirdNumber = AddTwo(firstNumber, secondNumber);
		printNumber(thirdNumber);
	}
	private static void printNumber(LinkedList<Integer> number) {
		for(Integer n: number) {
			System.out.println(n.intValue());
		}
	}
	private static LinkedList<Integer> AddTwo(LinkedList<Integer> firstNumber, LinkedList<Integer> secondNumber){
		LinkedList<Integer> thirdNumber = new LinkedList<Integer>(); //1
		int carry = 0; //1
		int i = 0; //1
		int sum = 0; //1
		int firstNumberSize = firstNumber.size();
		int secondNumberSize = secondNumber.size();
		while(firstNumberSize > i || secondNumberSize > i || carry > 0) { //n+2
			sum = (firstNumberSize > i? firstNumber.get(i): 0)  + (secondNumberSize > i? secondNumber.get(i): 0) + carry;//n+1
			if(sum >= 10) { //n+1
				carry = 1; //n+1
				thirdNumber.add(sum - 10); // n+1
			}
			else {
				carry = 0;
				thirdNumber.add(sum);
			}
			i++; //n+1
		};
		if(thirdNumber.getLast() == 0) //1 
			thirdNumber.remove(thirdNumber.size() - 1); //1
		return thirdNumber; //1
	}
}

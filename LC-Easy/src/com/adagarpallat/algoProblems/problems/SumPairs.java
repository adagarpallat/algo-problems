package com.adagarpallat.algoProblems.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.adagarpallat.algoProblems.Models.Pair;

public class SumPairs {
	public static void TrySumPairs() {
		System.out.println("Hello World!");
		int[] inputArray = new int[] {1,1,3,4,5,6,7,8,9};
		List<Pair> pairs = FindPairs(inputArray, 10);
		for(Pair p: pairs) {
			System.out.println(p.low + "," + p.high);
		}
	}
	private static List<Pair> FindPairs(int[] inputArray, int sum){
		List<Pair> pairs = new ArrayList<Pair>(); //O(1)
		Arrays.sort(inputArray);//O1
		int lowIndex = 0;//O1
		int highIndex = inputArray.length - 1;//O1
		int low, high;//O1
		do {
			low = inputArray[lowIndex];//O1
			high = inputArray[highIndex];//O1
			if(low + high > sum) {//O1
				highIndex--;//O1
			}
			else if(low + high < sum) {//O1
				lowIndex++;//O1
			}
			else {
				pairs.add(new Pair(inputArray[lowIndex], inputArray[highIndex]));//O1
				highIndex--;//O1
			}
		} while(lowIndex < highIndex);//
		return pairs;
	}
}

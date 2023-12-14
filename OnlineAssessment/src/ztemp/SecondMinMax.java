package ztemp;

import java.util.Arrays;
import java.util.List;

public class SecondMinMax {
//	Q1: Write a method that accepts an array and return the second min and max number.
	public static void main(String[] args) {
		int[] nums = new int[] {1,3,5,7,9};
		int[] result = findMinMax(nums);
		System.out.println(result[0] +" "+ result[1]);
	}
	
	/*
	 * if it is min,
	 * 	update secondMin with prev firstMin
	 * if it is not min,
	 * 	update secondMin with current num.
	 * 
	 * if it is max,
	 * 	update secondMax with prev firstMax
	 * if it is not max,
	 * 	update secondMax with current max.	   
	 */
	private static int[] findMinMax(int[] nums) {
		int firstMin = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		

		for(int currNum : nums) {
			if(currNum<=firstMin) {
				secondMin = secondMin< firstMin? secondMin : firstMin;
				firstMin = currNum;
			}else {
				secondMin = secondMin< currNum? secondMin : currNum;
			}
			
			if(currNum>= firstMax) {
				secondMax = secondMax> firstMax? secondMax: firstMax;
				firstMax = currNum;
			}
			else {
				secondMax = secondMax< currNum? currNum: secondMax;
			}
		}
		
		return new int[] {secondMin, secondMax};
	}
}

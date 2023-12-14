package com.demo;

public class ArrayExamples {

	public static void main(String[] args) {
		int a = 10;
		int i;
		int[] arr = {1,2,3,4,5};
		
		
		ArrayExamples arrayExample = new ArrayExamples();
		int[] result = arrayExample.getValue(arr);
		for(i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		System.out.println(arr);
	}
	
	public int[] getValue(int[] values) {
		int temp;
		
		for(int i=0; i<values.length;i++) {
			for(int j= i; j< values.length-1; j++) {			
				temp=values[j];
				values[j] = values[i];
				values[i] = temp;
			}
		}
		return values;
	}
	public int[] getValue1(int[] values) {
		System.out.println(values);
		System.out.println(values[3]);
		return null;
	}
}

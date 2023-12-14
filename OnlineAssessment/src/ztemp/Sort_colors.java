package ztemp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sort_colors {
	/*
	 * given array of size N containing only 9s, 1, and 2s. sort the array in ascending order.
		time complexity should be O(n).
		input:
			N=5
			arr[] = {0,2,1,2,0}
		output: {0,0,1,2,2}
	 */
	public static void main(String[] args) {
		int[] arr = {0,2,1,2,0};
		for(int n: arr)
			System.out.print(n+" ");
		System.out.println();
		sort(arr);
		for(int n: arr)
			System.out.print(n+" ");
	}
	
	public static void sort(int[] arr) {
		int n = arr.length;
		int zeroIdx = 0;
		int twoIdx = n-1;
		int currIdx=0;
		
		while(currIdx<= twoIdx && currIdx< n) {
			for(int an : arr)
				System.out.print(an+" ");
			System.out.println();
					
			int currVal = arr[currIdx];
			if(currVal == 0) {
				swap(currIdx, zeroIdx, arr);
				zeroIdx++;
				currIdx++;
				continue;
			}
			if(currVal == 1) {
				currIdx++;
				continue;
			}
			if(currVal ==2) {
				swap(currIdx, twoIdx, arr);
				twoIdx--;
				continue;
			}
			
		}
	}
	public static void swap(int i1, int i2, int[] arr) {
		int temp= arr[i1];
		System.out.println(i1+ " "+ i2);
		arr[i1] = arr[i2];
		arr[i2] = temp;
	}
	
}

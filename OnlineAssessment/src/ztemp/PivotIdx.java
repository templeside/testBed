package ztemp;

public class PivotIdx {
	/*
	 * Given an array A of n positive numbers. 
	 * the task is to find the first Equilibrium Point in an array.
	 * Equilibrium Point in an array is a position such that sum of elements before it is equal to the sum of elements after it.
	 * 
	 * Input:
	 * 		n=5
	 * 		A[] = {1,3,5,2,2}
	 * Output: 3
	 * 1+3 == 2+2
	 * 
	 * how to solve: using pointers
	 * {1,3,5,2,2}
	 * should be always same
	 */
	
    public static int pivotIndex(int[] nums) {
        int sum = 0, leftsum = 0;
        for (int x: nums) sum += x;
        for (int i = 0; i < nums.length; ++i) {
            if (leftsum == sum - leftsum - nums[i]) return i+1;
            leftsum += nums[i];
        }
        return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,5,2,2};
		System.out.println(pivotIndex(arr));
	}

}

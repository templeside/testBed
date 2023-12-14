import java.util.*;

/*
given an array Arr[] of N integers, Find the contiguous sub-array (containing at least one number),
which has the maximum sum and return its sum

input
    N=5
    Arr[] = [1,2,3,-2,5]
Output
    9
 */
public class ContiguousSubArray {
    /*
    whether adding, or starting first
     */
    public static int maxSubArray(int[] arr){
        int n = arr.length;
        int[] dp = new int[n];
        int max = arr[0];

        for(int i=1; i< n; i++){
            dp[i] = Math.max(dp[i-1]+arr[i], arr[i]);
            max = Math.max(dp[i], max);
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr= {1,2,3,-2,5};
        System.out.println(maxSubArray(arr));
    }
}
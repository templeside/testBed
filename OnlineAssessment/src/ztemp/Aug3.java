package ztemp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

// •        Coding Question (Must be solved using Stream APIs)
// o        Given a list of numbers n, and a value, k -> 
//			return the max average in the list of numbers for the range of k
//          EX: n = 1,2,3,4,5,6  k = 2  
//			Answer: 5.5 ~ int = 6

public class Aug3 {
	public static void main(String[] args) {
		  List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		  int k = 2;
		  double maxAverage = maxAverageInRange(numbers, k);
		  System.out.println("Max Average in range of " + k + " is: " + maxAverage);
		  System.out.println(findMax(numbers, k));
	}
    public static double maxAverageInRange(List<Integer> numbers, int k) {
        if (numbers == null || numbers.isEmpty() || k <= 0 || k > numbers.size()) {
            throw new IllegalArgumentException("Invalid input!");
        }

        double maxAverage = Double.MIN_VALUE;

        for (int i = 0; i <= numbers.size() - k; i++) {
            List<Integer> window = numbers.subList(i, i + k);
            double average = window.stream()
                                  .mapToInt(Integer::intValue)
                                  .average()
                                  .orElse(0.0);
            maxAverage = Math.max(maxAverage, average);
        }

        return maxAverage;
    }
    
    
    public static double findMax(List<Integer> l, int k) {
    	return l.stream().sorted(Comparator.reverseOrder()).limit(k).mapToDouble(Integer::doubleValue).average().getAsDouble();
    }


	
	
//	public static void main(String[] args) {
//		Write a program for airlines' routes for indirect flights (departure -> destination). 
//		(Write the code -> explain your thinking process -> They will ask questions about the code that you wrote)
//    1. We have a Flight class to represent each flight with properties like flightNumber, departureCity, and destinationCity.
//    2. The AirlineRoutes class contains a HashMap named routes to store the list of flights departing from each city.
//    3. AirlineRoutes has methods like addFlight to add new flights to the routes, and findIndirectRoutes to find indirect flight routes using the recursive DFS algorithm.
//    4. The main method demonstrates the usage of the AirlineRoutes class. We add some example flights and find the indirect routes from "New York" to "Rome."

//	}
	
	
////Coding: 1. Fibonacci sequence (Recursion using data structure) 
//	public static void main(String[] args) {
//		int n = 5;
//		int[] sequence = fibonacci(n);
//		for(int nums: sequence)
//		System.out.print(nums+" ");
//	}
//	
//	public static int[] fibonacci(int n) {
//		if(n == 0)return null;
//		
//		int[] nums = new int[n];
//		
//		nums[0] = 1;
//		if(n==1) return nums;
//		nums[1] = 1;
//		
//		for(int i=2; i<n; i++) {
//			nums[i] = nums[i-1]+nums[i-2];
//		}
//		return nums;
//	}
	
////	2. K-Fibonacci series 
//	public static void main(String[] args) {
//		int n = 4;
//		int k = 2;
//		int sequence = fibonacci(n, k);
//		
//		System.out.print(sequence+" ");
//	}
//	
//	public static int fibonacci(int n, int k) {
//		if(n == 0)return 1;
//		if(n< k)return 1;
//		
//		int[] nums = new int[n];
//		
//		for(int i=0; i<k ; i++) {
//			nums[i] = 1;
//		}
//		
//		for(int i=k; i<n; i++) {
//			nums[i] = nums[i-1]+nums[i-2];
//		}
//		return nums[n-1];
//	}
	
//    public static void main(String[] args) {
////    3. Print level order traversal of binary tree with each level in a different line
//
//    	// Create a binary tree for testing
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
//        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(7);
//
//        printLevelOrder(root);
//    }
//
//	public static void printLevelOrder(TreeNode root) {
//	        if (root == null) {
//	            return;
//	        }
//
//	        Queue<TreeNode> queue = new LinkedList<>();
//	        queue.add(root);
//
//	        while (!queue.isEmpty()) {
//	            int levelNodes = queue.size();
//	            for (int i = 0; i < levelNodes; i++) {
//	                TreeNode current = queue.poll();
//	                System.out.print(current.val + " ");
//	                if (current.left != null) {
//	                    queue.add(current.left);
//	                }
//	                if (current.right != null) {
//	                    queue.add(current.right);
//	                }
//	            }
//	            System.out.println(); // Move to the next line for the next level
//	        }
//	  }
	
//	//Coding: - given a list of integers and a target value, 
//	//return all lists that add up to the target value
//	/*
//	 * should iterate all items, so do the backtracking.
//	 */
//    public static List<List<Integer>> findListsThatAddUpToTarget(int[] nums, int target) {
//        List<List<Integer>> result = new ArrayList<>();
//        backtrack(nums, target, 0, new ArrayList<>(), result);
//        return result;
//    }
//
//    private static void backtrack(int[] nums, int target, int start, List<Integer> currentList, List<List<Integer>> result) {
//        if (target == 0) {
//            result.add(new ArrayList<>(currentList));
//            return;
//        }
//
//        for (int i = start; i < nums.length; i++) {
//            if (target - nums[i] >= 0) {
//                currentList.add(nums[i]);
//                backtrack(nums, target - nums[i], i, currentList, result);
//                currentList.remove(currentList.size() - 1);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] nums = {2, 4, 6, 3, 5};
//        int target = 8;
//
//        List<List<Integer>> lists = findListsThatAddUpToTarget(nums, target);
//
//        // Print the lists that add up to the target
//        for (List<Integer> list : lists) {
//            System.out.println(list);
//        }
//    }
	
////	6. Coding challenge from hackerRank. (circular array) looks like a doubly linked list.
//	public static void main(String[] args) {
//		
//	}
	
////	given a number and generate fibonacci series of that number and show the sum of last 3 digits.
//	public static void main(String[] args) {
//		int n = 5;
//		System.out.println(fibonacci(5));
//	}
//	private static int fibonacci(int n) {
//		if(n<3)return -1;
//		
//		int prevprev = 0;
//		int prev = 1;
//		int curr = 1;
//		
//		for(int i=0; i<n-3; i++) {
//			
//			int temp = curr+prev;
//			
//			prevprev = prev;
//			prev = curr;
//			curr = temp;
//		}
//		
//		return prevprev+prev+curr;
//	}
}


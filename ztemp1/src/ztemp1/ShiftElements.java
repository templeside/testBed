package ztemp1;

public class ShiftElements {

	/*
	 * arr = [1,2,3,4,5,6]
	 *		  0 1 2 3 4 5 
	 * new = [6,1,2,3,4,5]
	 * 
	 * new[i] = arr[i-k];
	 * algorithm: 
	 * 	save the last element
	 * 	 
	 * 	arr[i] = arr[i-1];
	 * 	
	 * 	but the curr element should be changed already,
	 * we should have temporary element saver.
	 * 
	 */
	public static int[] rightShift(int[] arr, int k) {
		k = k%arr.length;
		if(k <=0)return arr;
		
		int n = arr.length;
		int[] temp = new int[n];
		
		for(int i=n-1; i>=0 ; i--) {
			int shifted = (n+i-k)%n;
			temp[i] = arr[shifted];
		}
		return temp;
	}
	
	public static void main(String[] args) {
		 int[] arr = new int[] {1,2,3,4,5,6};
		 int k= 1;
		 
		 System.out.println(" ");
		 for(int element: arr)
			 System.out.print(element);
		 
		 int[] returnArr = rightShift(arr, k);
		 
		 System.out.println(" ");
		 for(int element: returnArr)
			 System.out.print(element);
	}

}

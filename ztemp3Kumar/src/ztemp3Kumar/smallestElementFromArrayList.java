package ztemp3Kumar;
import java.util.ArrayList;
import java.util.*;

public class smallestElementFromArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList();
		
		arr.add(1);
		arr.add(0);
		arr.add(3);
		
		System.out.println(arr.stream().min(Integer::compare));
		System.out.println(arr.stream().min(Integer::compare).get());
	}
}

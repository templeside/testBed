package Lambda;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

//public class StreamExamples2 {
//	public static void main(String[] args) {
//		List<Integer> values = Arrays.asList(1,7,8,9,10,2,3,4,5,6);
//		
//		int result = getMax(values);
//		System.out.println(result);
//	}
//
//	private static int getMax(List<Integer> numbers) {
//		// TODO Auto-generated method stub
//		int max = Integer.MIN_VALUE;
//		for(int i=0; i<numbers.size();i++){
//			Integer number = numbers.get(i);
//			if(number.intValue()>max) {
//				max = number.intValue();
//			}
//		}
//		return max;
//	}
//}

//same thing above
public class StreamExamples2 {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,7,8,9,10,2,3,4,5,6);
		
		IntSummaryStatistics state = values.stream().mapToInt((x)->x).summaryStatistics();
		System.out.println(state.getMax());
		System.out.println(state.getMin());
		System.out.println(state.getAverage());
		System.out.println(state.getSum());
	}
}
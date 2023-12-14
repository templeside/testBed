package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//public class StreamExamples {
//	public static void main(String[] args) {
//		List<String> strings = Arrays.asList("Allen", "","James","Black","","");
//		int result = getEmptyCountString(strings);
//		System.out.println("Below java 8 edition"+ result);
//	}
//
//	private static int getEmptyCountString(List<String> strings) {
//		int count = 0;
//		for(String value: strings) {
//			if (value.isEmpty())
//				count++;
//		}
//		return count;
//	}
//}

public class StreamExamples {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Allen", "","James","Black","","");
		long result1 = strings.stream().filter(value -> value.isEmpty()).count();
		
		Stream<String> stream = strings.stream();
		Stream<String> b = stream.filter(value-> value.isEmpty());
		
		long result2 = b.count();
		System.out.println("single line is "+ result1);
		System.out.println("multi line is "+ result2);
		
		//foreach 사용법
		strings.stream().filter(value -> !value.isEmpty()).forEach(System.out::println);
	}
}

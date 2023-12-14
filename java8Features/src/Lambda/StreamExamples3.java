package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExamples3 {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Allen", "","James","Black","","abc");
		long result1 = strings.stream().filter(value -> value.isEmpty()).count();
		
		long value = strings.stream().filter(string -> string.length() ==3).count();
		System.out.println(result1);
		System.out.println(value);
	}
}

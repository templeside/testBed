package predefinefunctionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExample {

	public static void main(String[] args) {
		//predefined functional interfaces: Function, BiFunction, Predicate
		Function<Integer, Integer> result = (x)->x;
		System.out.println(result.apply(10));
		
		BiFunction<Integer, Integer, Integer> biFunction = (x,y) -> x*y;
		System.out.println(biFunction.apply(10, 20));
		
		Predicate<Integer> predicate = (x) ->{	//predicate only returns boolean
			if( x!=0)
				return true;
			else
				return false;
		};
		System.out.println(predicate.test(10));
	}
}

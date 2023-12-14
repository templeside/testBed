package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExamples4 {
	public static void main(String[] args) {
		//custom object에서 stream API 사용하기
		// Allen인 Person 가지고 오려고 할 때
		List<Person> persons = Arrays.asList(new Person(1,"Allen"),new Person(2,"Black"), new Person(3, "James"));
		Person result = persons.stream()
				.filter((person)-> person.getName().equals("Allen"))
				.findFirst().orElse(null); 
		System.out.println(result);
		
		//id가 3인 name을 받으려고 할 때		
		String result1 = persons.stream()
				.filter((person)-> person.getId()==3)
				.map(person->person.getName()).findFirst().orElse(null);
		System.out.println(result1);
	}
}

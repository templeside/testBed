package dev.chanwoong;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloLambdaTest {

	@Test
	public void shouldReturnHelloTest() {
		var sut = new HelloLambda();
		assertEquals("Hello, AWS Lambda!", sut.handleRequest());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

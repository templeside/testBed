

package dev.chanwoong;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HelloLambdaTest {

	@Test
	public void shouldReturnHelloMessage() {
		var sut = new HelloLambda();
		assertEquals("Hello, AWS Lambda Chanwoong!", sut.handleRequest());
	}
}

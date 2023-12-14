package dev.chanwoong;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloNameTest {
	@Test
	public void shouldReturnHelloTest() {
		var sut = new HelloName();
		assertEquals("Hello, Chanwoong!", sut.handleRequest("Chanwoong"));
	}
}

package tddexample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tdd.HelloWorld;

class HelloWorldTest {

	HelloWorld hw;
	@BeforeEach
	void setObject() {
		hw = new HelloWorld();
	}
	
	@Test
	void addTwoNumbers() {
		assertEquals(50, hw.addNumbers(10,40));
	}
	

	@Test
	void subtractTwoNumbers() {
		assertEquals(-30, hw.subtractNumbers(10,40));
	}
	
}

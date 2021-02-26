package com.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FizzbuzzApplicationTests {

	private final FizzbuzzService fizzBuzz = new FizzbuzzService();

	@Test
	public void itShouldReturnTheGivenNumber() {
		assertEquals("1", this.fizzBuzz.convertNumber(1));
	}

	@Test
	public void itShouldReturnFizzWhenTheGivenNumberIsAMultipleOf3() {
		assertEquals("fizz", this.fizzBuzz.convertNumber(3));
	}

	@Test
	public void itShouldReturnBuzzWhenTheGivenNumberIsAMultipleOf5() {
		assertEquals("buzz", this.fizzBuzz.convertNumber(5));
	}

	@Test
	public void itShouldReturnFizzBuzzWhenTheGivenNumberIsAMultipleOf3And5() {
		assertEquals("fizzbuzz", this.fizzBuzz.convertNumber(15));
	}
}

package com.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * @author VMR
 */
@Service
public class FizzbuzzService {

	private static final String BUZZ = "buzz";
	private static final String FIZZ = "fizz";
	private static final String FIZZBUZZ = "fizzbuzz";

	/**
	 * convert input to fizz buzz
	 *
	 * @param number
	 * @return
	 *
	 *         If the integer is divisible by 3 and 5: result “fizzbuzz”. If the
	 *         integer is divisible by 3: result “fizz”. If the integer is divisible
	 *         by 5: result “buzz”. If the integer is divisible by 3 and 5: result a
	 *         string representation of the integer
	 */
	public List<FizzbuzzResponse> convertInputToFizzBuzz(final long number) {
		final List<FizzbuzzResponse> resultArray = new ArrayList<>();
		resultArray.add(new FizzbuzzResponse(number, this.convertNumber(number)));
		return resultArray;
	}

	/**
	 * convert input range to fizz buzz
	 *
	 * @param startNumber
	 * @param stopNumber
	 * @return
	 *
	 *         If the integer is divisible by 3 and 5: result “fizzbuzz”. If the
	 *         integer is divisible by 3: result “fizz”. If the integer is divisible
	 *         by 5: result “buzz”. If the integer is divisible by 3 and 5: result a
	 *         string representation of the integer
	 */
	public List<FizzbuzzResponse> convertInputRangeToFizzBuzz(final long startNumber, final long stopNumber) {
		final List<FizzbuzzResponse> resultArray = new ArrayList<>();
		for (long number = startNumber; number <= stopNumber; number++) {
			resultArray.add(new FizzbuzzResponse(number, this.convertNumber(number)));
		}
		return resultArray;
	}

	/**
	 * convert number to fizz buzz
	 *
	 * @param number
	 * @return
	 *
	 *         If the integer is divisible by 3 and 5: result “fizzbuzz”. If the
	 *         integer is divisible by 3: result “fizz”. If the integer is divisible
	 *         by 5: result “buzz”. If the integer is divisible by 3 and 5: result a
	 *         string representation of the integer
	 */
	public String convertNumber(final long number) {
		final boolean isFizz = number % 3 == 0;
		final boolean isBuzz = number % 5 == 0;
		// If the integer is divisible by 3 and 5: result “fizzbuzz”
		if (isFizz && isBuzz) {
			return FIZZBUZZ;
		}
		// If the integer is divisible by 3: result “fizz”
		if (isFizz) {
			return FIZZ;
		}
		// If the integer is divisible by 5: result “buzz”
		if (isBuzz) {
			return BUZZ;
		}
		// If the integer is divisible by 3 and 5: result a string representation of the
		// integer
		return String.valueOf(number);
	}

}

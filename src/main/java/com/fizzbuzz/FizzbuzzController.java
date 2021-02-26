package com.fizzbuzz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author VMR
 */
@RestController
@RequestMapping("/fizzbuzz")
@Api(value = "fizzbuzz", description = "Operations pertaining to convert numbers to fizzbuzz")
public class FizzbuzzController {

	private static final String INPUT_EXCEPTION_MESSAGE = "Acceptable numbers range : 1 to 4294967295.Invalid input : %s";
	private static final String RANGE_EXCEPTION_MESSAGE = "Acceptable numbers range : 1 to 4294967295. Start number should be always less than or equal to stop number.Invalid input range : %s to %s";

	@Autowired
	private FizzbuzzService fizzbuzzService;

	/**
	 * convert input to fizz buzz
	 *
	 * @param number
	 * @return
	 */
	@ApiOperation(value = "Convert input to fizz buzz")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Input successfully converted to fizzbuzz"),
			@ApiResponse(code = 400, message = "Bad Request"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@GetMapping(value = "/input")
	public ResponseEntity<?> convertInputToFizzBuzz(@RequestParam("number") final long number) {
		// number should be greater than 0
		if (number <= 0 || number > (2 ^ 32 - 1)) {
			return new ResponseEntity<>(String.format(INPUT_EXCEPTION_MESSAGE, number), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(this.fizzbuzzService.convertInputToFizzBuzz(number), HttpStatus.OK);
	}

	/**
	 * convert input range to fizz buzz
	 *
	 * @param number
	 * @return
	 */
	@ApiOperation(value = "Convert input range to fizz buzz")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Input range successfully converted to fizzbuzz"),
			@ApiResponse(code = 400, message = "Bad Request"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@GetMapping(value = "/inputrange")
	public ResponseEntity<?> convertInputRangeToFizzBuzz(@RequestParam("start") final long start,
			@RequestParam("stop") final long stop) {
		// start number should be greater than 0 and always less than or equal to stop
		// number
		if (start <= 0 || stop > (2 ^ 32 - 1) || start > stop) {
			return new ResponseEntity<>(String.format(RANGE_EXCEPTION_MESSAGE, start, stop), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(this.fizzbuzzService.convertInputRangeToFizzBuzz(start, stop), HttpStatus.OK);
	}

}

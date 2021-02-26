package com.fizzbuzz;

/**
 * @author VMR
 */
public class FizzbuzzResponse {

	private long in;

	private String result;

	/**
	 * @return the in
	 */
	public long getIn() {
		return this.in;
	}

	/**
	 * @param in the in to set
	 */
	public void setIn(final long in) {
		this.in = in;
	}

	/**
	 * @return the result
	 */
	public String getResult() {
		return this.result;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(final String result) {
		this.result = result;
	}

	/**
	 * @param in
	 * @param result
	 */
	public FizzbuzzResponse(final long in, final String result) {
		super();
		this.in = in;
		this.result = result;
	}

}

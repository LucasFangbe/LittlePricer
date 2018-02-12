/**
 * 
 */
package com.pricer.scheme;

/**
 * @author fangbe
 *
 */
public class ProductNotSupportedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public ProductNotSupportedException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public ProductNotSupportedException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public ProductNotSupportedException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ProductNotSupportedException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public ProductNotSupportedException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}

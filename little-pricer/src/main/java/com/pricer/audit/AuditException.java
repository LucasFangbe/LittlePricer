/**
 * 
 */
package com.pricer.audit;

/**
 * @author fangbe
 *
 */
public class AuditException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public AuditException() {
	}

	/**
	 * @param message
	 */
	public AuditException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public AuditException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public AuditException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public AuditException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}

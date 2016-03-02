package com.world.pay.exceptions;

public class IllegalNumberException extends Exception{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IllegalNumberException() {
		super();
	}

	/**
	 * Public Constructor
	 * 
	 * @param message
	 *            The message to be passed to this exception
	 */
	public IllegalNumberException(final String message) {
		super(message);

	}

	/**
	 * Public Constructor
	 * 
	 * @param cause
	 *            The cause of this Exception
	 */
	public IllegalNumberException(final Throwable cause) {
		super(cause);

	}

	/**
	 * Public Constructor
	 * 
	 * @param message
	 *            The message to be passed to this exception
	 * @param cause
	 *            The cause of this Exception
	 */
	public IllegalNumberException(final String message, final Throwable cause) {
		super(message, cause);

	}
}

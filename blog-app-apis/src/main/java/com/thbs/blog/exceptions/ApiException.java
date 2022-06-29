package com.thbs.blog.exceptions;
/**
 * 
 * @author kannappagoud_shiva
 *
 */
public class ApiException extends RuntimeException {

	public ApiException(String message) {
		super(message);

	}

	public ApiException() {
		super();

	}

}

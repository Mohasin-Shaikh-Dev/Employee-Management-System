package com.employee.www.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// when this exception is throw then http response should be 404 not found
@ResponseStatus(value = HttpStatus.NOT_FOUND) 
public class ResourceNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(String msg) {
		super(msg);
	}

	
}

package com.user.util;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException{

	
	private static final long serialVersionUID = 123456L;

	public UserNotFoundException(String msg) {
		super(msg);
	}
	
}

package com.book.util;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class BookNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 123456L;

	private String msg;
	
	public BookNotFoundException(String msg1) {
		msg=msg1;
	}

}

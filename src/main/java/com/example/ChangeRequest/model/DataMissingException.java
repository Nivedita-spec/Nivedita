package com.example.ChangeRequest.model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "User Not Found")
public class DataMissingException extends Exception {

	String message;

	public DataMissingException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return "UserApp Exception : " + message.toString();
	}
}

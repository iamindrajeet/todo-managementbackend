package com.example.todomanagement.exception;

public class ResourceNotFoundException extends RuntimeException{

    /**
	 * 
	 */
	private static final long serialVersionUID = 8886133753521820950L;

	public ResourceNotFoundException(String message) {
        super(message);
    }
}
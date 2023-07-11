package com.example.todomanagement.exception;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class TodoAPIException extends RuntimeException{

	private HttpStatus httpStatus;
	private String message;
}

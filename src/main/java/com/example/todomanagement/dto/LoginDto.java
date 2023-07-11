package com.example.todomanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginDto {

	private String usernameOrEmail;
	private String password;
}

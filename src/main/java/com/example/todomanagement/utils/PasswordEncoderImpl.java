package com.example.todomanagement.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//class to encode the password
public class PasswordEncoderImpl {
	
	public static void main(String[] args) throws Exception {
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		System.out.println(passwordEncoder.encode("indrajeet"));
		System.out.println(passwordEncoder.encode("admin"));
	}

}

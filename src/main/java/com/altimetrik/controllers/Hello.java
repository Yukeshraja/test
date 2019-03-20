package com.altimetrik.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class Hello {

	@GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.ALL_VALUE)
	public ResponseEntity<String> getUserDetailByGitlabEmailId() {
        System.out.println("Inside first controller");
		return new ResponseEntity<>("Wecome to Playground...Java-007", HttpStatus.OK);

	}

}

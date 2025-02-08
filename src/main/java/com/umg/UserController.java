package com.umg;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class UserController {

	@GetMapping("/getname")
	public ResponseEntity<String> getName() {
		return new ResponseEntity<>("it project", HttpStatus.OK);
	}

}

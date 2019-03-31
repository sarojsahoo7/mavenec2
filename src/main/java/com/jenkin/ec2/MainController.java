package com.jenkin.ec2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping(value="/{id}")
	public String retriveName(@PathVariable("id") String name) {
		return "Welcome " + name + " to Devops";
	}

}

package io.s3soft.cartservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
    @Autowired
    private Environment env;
    
	@GetMapping("/hi")
	public String greet() {
		return "Oye! "+env.getProperty("greeting");
	}
}

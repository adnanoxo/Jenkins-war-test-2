package com.example.deploymenttask;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class tyController {
	
@RequestMapping("/hello")
	public String hello() {
	return "Hello World!";

}

@GetMapping("/")
public String index() {
	

	return "index.html";
}
}

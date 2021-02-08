package com.mankos.retroboard; 

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController{

	@RequestMapping("/hello")
	public String sayHi(){
		return "Hello my model is not running";
	}
}

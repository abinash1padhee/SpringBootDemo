package com.opensource.springbootstarter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author akumarpadhee
 *
 */
@RestController
public class CourseAppController {
	
	@RequestMapping("/landing")
	public String getDefaultMessage() {
		return "Spring Boot Application";
	}

}

package com.sergiorosa.comercial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oportunity")
public class OportunityController {
	
	@GetMapping
	public String lists() {
		return "Hello Sergio";
	}
}

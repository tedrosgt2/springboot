package com.tcode.bookstore.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Book1Controller {

	@RequestMapping("/rest")
	public String hey() {

		return "Hellooo REST web app";
	}

}

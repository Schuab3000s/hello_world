package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objectives")
public class Objectives {

	@GetMapping("/objectives")
	public String objective() {
		return "Aprender a trabalhar com Spring Boot\n"
				+ "Consolidar os aprendizados\n"
				+ "Aprimorar minha atenção ao detalhe";
	}
}

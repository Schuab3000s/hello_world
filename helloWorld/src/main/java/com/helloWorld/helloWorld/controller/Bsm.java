package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class Bsm {

	@GetMapping("/bsm")
	public String listBSM() {
		return "Orientação ao Detalhe\n"
				+ "Mentalidade de Crescimento\n"
				+ "Orientação ao futuro\n"
				+ "Persistência\n"
				+ "Trabalho em equipe\n"
				+ "Atenção aos detalhes\n"
				+ "Proatividade\n"
				+ "Comunicação";
	}
}

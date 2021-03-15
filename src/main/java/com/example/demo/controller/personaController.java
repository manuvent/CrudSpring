package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.interfaceservice.ipersonaService;
import com.example.demo.model.Persona;

@Controller
@RequestMapping
public class personaController {
	
	@Autowired
	private ipersonaService service;

	@GetMapping("/listar")
	public String listar(Model model) {
		List<Persona>personas=service.Listar();
		model.addAttribute("personas",personas);
		return "index";
	}
}

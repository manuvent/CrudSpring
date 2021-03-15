package com.example.demo.interfaceservice;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Persona;

public interface ipersonaService {

	public List<Persona>Listar();
	public Optional<Persona>listarId(int id);
	public int save(Persona p);
	public void delete(int id);
	
	
	
	
	
}

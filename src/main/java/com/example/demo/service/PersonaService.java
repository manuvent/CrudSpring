package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaces.iPersona;
import com.example.demo.interfaceservice.ipersonaService;
import com.example.demo.model.Persona;

@Service
public class PersonaService implements ipersonaService {
	
	@Autowired
	private iPersona data;
	
	@Override
	public List<Persona> Listar() {
		
		return (List<Persona>)data.findAll();
	}

	@Override
	public Optional<Persona> listarId(int id) {
		
		return data.findById(id);
	}

	@Override
	public int save(Persona p) {
		int res = 0;
		Persona persona=data.save(p); 
		if(!persona.equals(null)) {
			res= 1;
		}
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}

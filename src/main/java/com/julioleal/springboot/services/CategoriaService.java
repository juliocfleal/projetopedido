package com.julioleal.springboot.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.julioleal.springboot.domain.Categoria;
import com.julioleal.springboot.repositories.CategoriaRepository;
import com.julioleal.springboot.services.exeptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id){
		
		Optional<Categoria> obj = repo.findById(id);
		
		
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto nao encotrado! ID: " + id + ", Tipo: " + Categoria.class.getName()
				));
		
	}
}

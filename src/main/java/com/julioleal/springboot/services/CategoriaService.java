package com.julioleal.springboot.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.julioleal.springboot.domain.Categoria;
import com.julioleal.springboot.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Optional<Categoria> find(Integer id){
		
		Optional<Categoria> obj = repo.findById(id);
		return Optional.of(obj.orElse(null));
		
	}
}

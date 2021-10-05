package com.julioleal.springboot.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.julioleal.springboot.domain.Cliente;
import com.julioleal.springboot.repositories.ClienteRepository;
import com.julioleal.springboot.services.exeptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id){
		
		Optional<Cliente> obj = repo.findById(id);
		
		
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto nao encotrado! ID: " + id + ", Tipo: " + Cliente.class.getName()
				));
		
	}
}

package com.julioleal.springboot.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.julioleal.springboot.domain.Pedido;
import com.julioleal.springboot.repositories.PedidoRepository;
import com.julioleal.springboot.services.exeptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id){
		
		Optional<Pedido> obj = repo.findById(id);
		
		
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto nao encotrado! ID: " + id + ", Tipo: " + Pedido.class.getName()
				));
		
	}
}

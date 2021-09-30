package com.julioleal.springboot;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.julioleal.springboot.domain.Categoria;
import com.julioleal.springboot.repositories.CategoriaRepository;

@SpringBootApplication
public class SpringbootApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(0 , "Informatica");
		Categoria cat2 = new Categoria(0, "Escritorio");
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		
	}

}
